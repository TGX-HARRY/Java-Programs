import java.util.Scanner;
import java.util.Stack;

public class StackFactorial {
    public static void main(String[] args) {
        long i = 1, n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Stack<Long> stk = new Stack<>();
        stk.push(1l);
        while (i <= n) {
            stk.push(stk.peek()*i);
            i++;
        }
        System.out.println("Factorial: " + stk.peek());
        sc.close();
        return;
    }

}
