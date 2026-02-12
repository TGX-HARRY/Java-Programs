import java.util.*;

public class TowerOfHanoi {
    public static int numberOfMinimumSeteps(int n, int from, int aux, int to) {
        if (n == 0) return 1;
        int r1 = numberOfMinimumSeteps(n-1, from, aux, to);
        int r2 = numberOfMinimumSeteps(n-1, to, from, aux);
        return Math.min(r1, r2);
    } 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(numberOfMinimumSeteps(n));
        return;
    }
}
