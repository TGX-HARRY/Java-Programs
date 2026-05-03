public class DynamicStack {
    public static class NODE {
        public int data;
        public NODE next = null;

        public NODE(int data) {
            this.data = data;
        }
    };

    public static class STK {
        private NODE head;

        public boolean isEmpty() {
            return head == null;
        }

        public int top() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        public boolean pop() {
            if (head == null) {
                System.out.println("Stack is empty, operation cannot be performed");
                return false;
            } else {
                System.out.println("Removed: " + head.data);
                head = head.next;
                return true;
            }
        }

        public boolean push(int data) {
            if (head == null) {
                head = new NODE(data);
                return true;
            }
            NODE nn = new NODE(data);
            nn.next = head;
            head = nn;
            return true;
        }

        public static void main(String[] args) {
            STK stk = new STK();
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
            stk.pop();
            System.out.println(stk.top());
            return;
        }
    }
}
