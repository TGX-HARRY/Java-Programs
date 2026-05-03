public class LLqueue {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class QUEUE {
        private Node front;
        private Node rear;
        private int size;

        public QUEUE() {
            this.front = null;
            this.rear = null;
            size = -1;
        }

        public boolean enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return true;
            }
            rear.next = newNode;
            rear = newNode;
            size++;
            return true;
        }

        public boolean dequeue() {
            if (front == null) {
                throw new UnsupportedOperationException("Capacity underflow: empty queue");
            }
            System.out.println("Removed: " + front.data);
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
            return true;
        }

        public void peek() {
            if (front != null) {
                System.out.println("Front: " + front.data);
            } else {
                System.out.println("Front: null");
            }
            if (rear != null) {
                System.out.println("Rear/tail: " + rear.data);
            } else {
                System.out.println("Rear/tail: null");
            }
        }

        public boolean isEmpty() {
            return size == 0 || size == -1;
        }
    }
    public static void main(String[] args) {
        QUEUE queue = new QUEUE();
        queue.enqueue(10);
        queue.peek();
        queue.enqueue(20);
        queue.peek();
        queue.enqueue(30);
        queue.peek();
        queue.enqueue(40);  
        queue.peek();
    }
}