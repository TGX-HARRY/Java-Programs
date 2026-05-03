import java.util.*;

public class recurFactorial {

    public static int facto(int n) {
        if (n==1) return 1;
        else return n*facto(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        System.out.println(facto(n));
        sc.close();
    }
    
}
