import java.util.*;
public class SubsetSums {
    public static List<Integer> subsetSums(int[] arr, int n) {
        List<Integer> result = new ArrayList<>();
        helper(0, 0, arr, n, result);
        return result;
    }
    public static void helper(int i, int sum, int[] arr, int n, List<Integer> result) {
        if (i == n) {
            result.add(sum);
            return;
        }
        // Include the current element
        helper(i + 1, sum + arr[i], arr, n, result);
        // Exclude the current element
        helper(i + 1,  sum, arr, n, result);
        return;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        List<Integer> sums = subsetSums(arr, n);
        System.out.println("Subset sums: " + sums);
    }
}
