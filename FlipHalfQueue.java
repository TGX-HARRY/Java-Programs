import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class FlipHalfQueue {
    public static void flipHalfQueue(Queue<Integer> queue) {
        // given a queue, flip or reverse the odd and even indexed elements separately
        int n = queue.size();
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++) {
            // remove first half elements and push to stack
            int val = queue.remove();
            if (n%2 == 1) stk.push(val);
            queue.add(val);
        }
        for(int i=0;i<n;i++) {
            int val = queue.remove();
            if (n%2 == 1) {
                queue.add(stk.pop());
            }
            else {
                queue.add(val);
            }
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        flipHalfQueue(queue);
        for (int num : queue) {
            System.out.print(num + " ");
        }
    }
}
