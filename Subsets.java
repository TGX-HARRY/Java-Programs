import java.util.ArrayList;
import java.util.List;

public class Subsets {
    class Solution {
        public List<List<Integer>> helper(int[] arr, int index, int size, List<Integer> curr, List<List<Integer>> ans) {
            if (index == arr.length) {
                ans.add(curr);
                return ans;
            }
            curr.add(arr[index]);
            helper(arr, index + 1, size, curr, ans);

            curr.remove(curr.size() - 1);
            helper(arr, index + 1, size, curr, ans);

            return ans;
        }

        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> curr = new ArrayList<>();
            return helper(nums, 0, nums.length, curr, ans);
        }
    }
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        Solution solution = subsets.new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = solution.subsets(nums);
        System.out.println(allSubsets);
    }
}
