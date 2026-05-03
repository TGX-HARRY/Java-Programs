import java.util.HashSet;
import java.util.Set;

public class SecureKeyExchange {
    public static int validCases(int[] arr, int diff) {
        // arr = {1,2,3,4,5,6,7,8,9,10}
        // diff = 7
        Set<Integer> set = new HashSet<>();
        for(int i: arr) set.add(i);
        int ans = 0;
        for(int i: arr) {
            if (set.contains(i+diff)) ans++;
        }

        return ans;
    }    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int diff = 7;
        System.out.println("Answer: " + validCases(arr, diff));

        return;
    }
}
