import java.util.Scanner;

public class PriorityQueues {
    public static class Queue {
        private int[] heap;
        private int size;
        private int capacity;

        public int top() {
            if (size == 0)
                throw new UnsupportedOperationException("Heap is empty.");
            return heap[0];
        }
        private int getLeftIndex(int parentIndex) {
            int l = 2 * parentIndex + 1;
            return (l<size)?l:-1;
        }

        private int getRightIndex(int parentIndex) {
            int r = 2 * parentIndex + 2;
            return (r < size) ? r : -1;
        }
        
        private int getParentIndex(int childIndex) {
            if (childIndex == 0)
                return -1;
            return (childIndex - 1) / 2;
        }

        public Queue(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.heap = new int[capacity];
        }

        public void doPrecolateUp(int index) {
            int prntIndx = getParentIndex(index);
            if (prntIndx == -1)
                return;

            if (heap[index] < heap[prntIndx]) {
                int temp = heap[index];
                heap[index] = heap[prntIndx];
                heap[prntIndx] = temp;
                doPrecolateUp(prntIndx);
            }
        }

        public void doPrecolateDown(int index) {
            if (index >= size)
                return; 

            int leftIndx = getLeftIndex(index);
            int rightIndx = getRightIndex(index);
            int minIndx = index;

            if (leftIndx != -1 && heap[leftIndx] < heap[minIndx])
                minIndx = leftIndx;

            if (rightIndx != -1 && heap[rightIndx] < heap[minIndx])
                minIndx = rightIndx;

            if (minIndx != index) {
                int temp = heap[minIndx];
                heap[minIndx] = heap[index];
                heap[index] = temp;
                doPrecolateDown(minIndx);
            }
        }

        public boolean enqueue(int data) {
            if (size >= capacity)
                throw new UnsupportedOperationException("Heap overflow: size limit exceeded.");

            heap[size] = data;
            doPrecolateUp(size);
            size++;
            return true;
        }

        public boolean dequeue() {
            if (size == 0)
                throw new UnsupportedOperationException("Heap underflow: no elements found.");

            System.out.println("Element removed: " + heap[0]);

            heap[0] = heap[size - 1];
            size--;
            doPrecolateDown(0);
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k;
        System.out.println("Enter which kth largest to get: ");
        k = sc.nextInt();


        Queue queue = new Queue(k);
        int[] array = {2,7,4,8,0,1,6};

        for(int i=0;i<k;i++) {
            queue.enqueue(array[i]);
        }
        for(int i=k;i<array.length;i++) {
            if (queue.top() < array[i]) {
                queue.dequeue();
                queue.enqueue(array[i]);
            }
        }
        System.out.println("Kth largest is: " + queue.top());
        sc.close();
        return;
    }
}
