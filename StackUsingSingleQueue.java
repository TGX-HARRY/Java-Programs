import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    static class Stack {
        Queue<Integer> q;
        public Stack() {
            q = new LinkedList<>();
        }

        private Queue<Integer> helper(int num, Queue<Integer> q) {
            if (q.isEmpty()) {
                q.add(num);
                return q;
            }

            int data = q.remove();
            helper(num, q);
            q.add(data);
            return q;
        }

        public void push(int num) {
            q = helper(num, q);
        }

        public int peek() {
            return q.peek();
        }

        public int remove() {
            return q.remove();
        }

        public int size() {
            return q.size();
        }

        @Override
        public String toString() {
            if (q.isEmpty()) return "";
            String sb = "";
            while(!q.isEmpty()) {
                sb += q.remove() + ", ";
            }
            return sb.substring(0, sb.length() - 2);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        System.out.println(st.peek());
        st.push(20);
        System.out.println(st.peek());
        st.push(30);
        System.out.println(st.peek());

        System.out.println(st.remove());
        System.out.println(st.remove());
        System.out.println(st.remove());
        // System.out.println(st);
    }
}
