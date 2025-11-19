public class Queue {
    /*
     * A queue os defined as a linear data structure that is open at both sides or ends and the 
     * operations are performed based on FIFO(First In First Out) principle.
     * We define a queue to be a list inw hich all addition to the list are made at one end,
     * and all deletion from the list are made at the other end.
     * The element which is first pushed into the order the operations is first perfomrfed on it.
     * 4 types of queue: Linear, Circular, Deque(Double ended queue) and priority queue
     */
    public static class QUEUE {
        private int[] queue;
        private int capacity;
        private int front;
        private int rear;

        public QUEUE(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity];
            front = -1;
            rear = -1;
        }
        
        public boolean enqueue(int data) { 
            if (rear+1 == capacity) {
                throw new UnsupportedOperationException("Capacity overflow");
            }
            else {
                queue[++rear] = data;
                front = 0;
                return true;
            }
        }

        public boolean dequeue() {
            if (front == -1) {
                throw new UnsupportedOperationException("Capacity underflow: empty queue");
            }
            System.out.println("Removed: " + queue[front++]);
            return true;
        }

        public void peek() {
            System.out.println("Front: " + queue[front]);
            System.out.println("Rear/tail: " + queue[rear]);
        }

        public boolean isEmpty() {
            if (front == -1 || front == rear) return true;
            return false;
        }
        
        public boolean isFull() {
            if (rear + 1 == capacity) return true;
            return false;
        }
        }

        public static void main(String[] args) {
            QUEUE queue = new QUEUE(4);
            queue.enqueue(10);
            queue.peek();
            queue.enqueue(20);
            queue.peek();
            queue.enqueue(30);
            queue.peek();
            queue.enqueue(40);
            queue.peek();
            queue.dequeue();
            queue.peek();
            queue.dequeue();
            queue.peek();
        }
    }

