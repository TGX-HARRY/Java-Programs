import java.util.Stack;

public class EvaluatePostfix {
    public int EvaluatePostF(String postfix) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<postfix.length();i++) {
            char ch = postfix.charAt(i);
            if (ch == '+') {
                int x = stk.pop();
                int y = stk.pop();
                stk.push(y+x);
            }
            else if (ch == '-') {
                int x = stk.pop();
                int y = stk.pop();
                stk.push(y - x);
            }
            else if (ch == '*') {
                int x = stk.pop();
                int y = stk.pop();
                stk.push(y * x);
            }
            else if (ch == '^') {
                int x = stk.pop();
                int y = stk.pop();
                stk.push((int)Math.pow(y, x));
            }
            else if (ch == '/') {
                int x = stk.pop();
                int y = stk.pop();
                stk.push(y / x);
            }
            else {
                stk.push(ch - '0');
            }
        }
        return stk.peek();
    }
    public static void main(String[] args) {
        String postfix = "231*+9-";
        EvaluatePostfix ep = new EvaluatePostfix();
        int result = ep.EvaluatePostF(postfix);
        System.out.println("Evaluated result: " + result);
        System.out.println("Expected result: -4");
        return;
    }
}
