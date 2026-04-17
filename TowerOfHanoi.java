import java.util.*;

public class TowerOfHanoi {
    public static int numberOfMinimumSeteps(int n, int from, int aux, int to) {
        if (n == 1) return 1;
        int count = numberOfMinimumSeteps(n-1, from, aux, to);
        count++;
        count += numberOfMinimumSeteps(n-1, to, from, aux);
        return count;
    } 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(numberOfMinimumSeteps(n, 0, 1, 2));
        sc.close();
        return;
    }
}
