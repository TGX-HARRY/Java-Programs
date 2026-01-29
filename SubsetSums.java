import java.util.*;

public class SubsetSums {
    public static void fillArray(int[] arr, ArrayList<Integer> ans, Boolean[] completed, int currind, int ind) {
        if (currind >= arr.length) {
            return;
        }
        if (ind >= arr.length) {
            completed[currind] = true;
            currind++;
        }
        if (!completed[currind] && currind != ind) ans.add(arr[ind] + arr[currind]);
        fillArray(arr, ans, completed, currind, ind+1);
    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        for(int el: arr) ans.add(el);
        Boolean[] completed = new Boolean[arr.length];
        Arrays.fill(completed, false);
        fillArray(arr, ans, completed, 0, 0);
        return ans;
    }
   public static void main(String[] args) {
        int[] test = {2,3};
        ArrayList<Integer> ans = subsetSums(test);
        for(int el: ans) System.out.print(el +", ");
   }
}
