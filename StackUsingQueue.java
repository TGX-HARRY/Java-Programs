import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> q1;
        Queue<Integer> q2;

        public Stack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int val) {
            q2.add(val);
            while(!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = new LinkedList<>(q2);
            q2 = q1;
            q1 = temp;
        }

        public int peek() {
            return q1.peek();
        }

        public int remove() {
            int data = q1.peek();
            q1.remove();
            return data;
        }

        @Override
        public String toString() {
            String sb = "";
            q2 = q1;
            while(!q1.isEmpty()) {
                sb += q1.remove() + " ";
            }
            q1 = q2;
            return sb;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        // System.out.println("removed: " + st.remove());
        st.push(30);
        // System.out.println("removed: " + st.remove());
        System.out.println("top : " + st.peek());
        System.out.println(st);
    }
}
