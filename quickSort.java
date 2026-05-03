

public class quickSort {
    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // put pivot in the correct place
        int temp = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = temp;

        return i + 1; // index of pivot
    }
    public static void doQSort(int[] nums, int start, int end) {
     if (start < end) { // ✅ base case
            int mid = partition(nums, start, end);

            doQSort(nums, start, mid - 1);
            doQSort(nums, mid + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,9,7,3,8,30,6};
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        doQSort(arr, 0, arr.length-1);
        for(int el: arr) {
            System.out.println(el + " ");
        }
    } 
}
