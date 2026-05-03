import java.util.Arrays;

public class binarySearch {
    public static int doBinarySearch(int[] nums, int target) {
        int beg = 0, end = nums.length-1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2; // prevent going out of range
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,7,8,90,96,20,50,78,0};
        Arrays.sort(arr);
        System.out.println(doBinarySearch(arr, 96));        
    }
}
