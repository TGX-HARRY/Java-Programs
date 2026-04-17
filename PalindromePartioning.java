import java.util.*;

public class PalindromePartioning {
    public static boolean isPalindrome(String str, int left, int right) {
        while (left <= right) {
            if (str.charAt(right) != str.charAt(left)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void helper(int index, String str, List<String> curr, List<List<String>> ans) {
        if (str.length() == index) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int j=index;j<str.length();j++) {
            if (isPalindrome(str, index, j)) {
                curr.add(str.substring(index, j+1));
                helper(j + 1, str, curr, ans);
                curr.remove(curr.size() - 1);
                
            }
        }
    }
    public static List<List<String>> partioning(String str) {
        if (str.length() == 0 || str == null) {
            return new ArrayList<>();
        }
        List<List<String>> ans = new ArrayList<>();
        helper(0, str, new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String[] args) {
        String test = "abcaa";
        List<List<String>> ans = partioning(test);
        for(List<String> list : ans) {
            System.out.println(list);
        }
    }
}
