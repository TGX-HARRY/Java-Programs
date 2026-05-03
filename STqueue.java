import java.util.Stack;

public class STqueue {
    public static class QUEUE {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        private int size;

        public QUEUE() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
            size = -1;
        }

        public boolean enqueue(int data) {
            stack1.push(data);
            size++;
            return true;
        }

        public boolean dequeue() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                throw new UnsupportedOperationException("Capacity underflow: empty queue");
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            System.out.println("Removed: " + stack2.pop());
            size--;
            return true;
        }

        public void peek() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Front: null");
                System.out.println("Rear/tail: null");
                return;
            }
            if (!stack2.isEmpty()) {
                System.out.println("Front: " + stack2.peek());
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                System.out.println("Front: " + stack2.peek());
            }
            System.out.println("Rear/tail: " + stack1.firstElement());
        }

        public boolean isEmpty() {
            return size == -1;
        }

        public int size() {
            return size + 1;
        }
    }

    public static void main(String[] args) {
        QUEUE queue = new QUEUE();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.peek(); // Front: 10, Rear/tail: 10
        queue.dequeue(); // Removed: 10
        queue.peek(); // Front: 20, Rear/tail: 10
        System.out.println("Is empty: " + queue.isEmpty()); // Is empty: false
        System.out.println("Size: " + queue.size()); // Size: 2

        
    }
}
