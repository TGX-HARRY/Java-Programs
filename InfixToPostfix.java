import java.util.*;

public class InfixToPostfix {
    public static int precedence(char op) {
        if (op == '^') return 3;
        else if ("*/".indexOf(op) != -1) return 2;
        else if ("+-".indexOf(op) != -1) return 1;
        return -1;
    }
     
    public static String itp(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c: infix.toCharArray()) {
            if ((c >= 'A' && c <='Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) postfix.append(c);
            else if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                while (st.peek() != '(') {
                    postfix.append(st.pop());
                }
                // remove the last '('
                st.pop();
            }
            else {
                while(true) {
                    if (st.isEmpty()) break;
                    if (precedence(st.peek()) >= precedence(c)) {
                        postfix.append(st.pop());
                    }
                    else break;
                }
                st.push(c);
            }
        }
        while (!st.isEmpty())
            postfix.append(st.pop());
        return postfix.toString();
    }
    public static int evaluatePostfix(String postfix) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)";
        String postfix = itp(infix);
        System.out.println("Infix expression: " + infix);
        System.out.println("Postfix expression: " + postfix);
        int result = evaluatePostfix(postfix);
        System.out.println("Evaluated result: " + result);
        return;
    }
}
