import java.util.*;

public class CombinationSum {
    public void helper(int[] arr, int target, int index, int sum, List<Integer> curr, List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (sum > target || index == arr.length) {
            return;
        }

        curr.add(arr[index]);
        helper(arr, target, index, sum + arr[index], curr, ans);
        curr.remove(curr.size() - 1);
        helper(arr, target, index + 1, sum, curr, ans);
    }   
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates, target, 0, 0, curr, ans);
        return ans;
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = cs.combinationSum(candidates, target);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
