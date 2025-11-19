public class Stacks {
    public static class STK {
        private int arr[];
        private int top;
        private int capacity;

        public STK(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public boolean isEmpty() {
            return top<0;
        }

        public int top() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        public boolean isFull() {
            return (top+1 == capacity);
        }

        public boolean pop() {
            if (top < 0) {
                System.out.println("Stack is empty, operation cannot be performed");
                return false;
                
            }
            else {
                top--;
                return true;
            }
        }

        public boolean push(int data) {
            if (isFull()) {
                System.err.println("Stack overflow");
                return false;
            }
            else {
                top++;
                arr[top] = data;
                return true;
            }
        }
    }
    public static void main(String[] args) {
        STK stk = new STK(10);
        stk.push(0);
        stk.push(5);
        stk.push(2);
        stk.push(10);
        stk.push(55);
        stk.push(50);
        stk.push(5);
        stk.push(22);
        stk.push(100);
        stk.push(101);
        stk.push(0);
        System.out.println(stk.top());
        return;
    }
}
