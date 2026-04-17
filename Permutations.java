import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        String test = "abc";
        List<String> ans = permute(test);
        int count = 1;
        System.out.println("Count must be " + factorial(test.length()));
        for(String str : ans) {
            System.out.println(count++ + ": " + str);
        }
    }
    public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
    
    public static List<String> permute(String str) {
        List<String> ans = new ArrayList<>();
        helper(str, 0, ans);
        return ans;
    }

    public static void helper(String str, int index, List<String> ans) {
        if (index == str.length()) {
            ans.add(str);
            return;
        }

        for(int j=index;j<str.length();j++) {
            str = swap(str, index, j);
            helper(str, index + 1, ans);
            str = swap(str, index, j);
        }
    }

    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
}
