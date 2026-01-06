public class FindLastOccurrence {
    public static int findLastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid; 
                start = mid + 1; 
            } else if (arr[mid] > target) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,5,5,4,2,2};
        int[] challenges =  {5,2,6};
        int sum = 0;
        for(int i=0;i<challenges.length;i++) {
            sum += (findLastOccurrence(arr, challenges[i]));
        }
        System.out.println("Answer: " + sum);
        return;
    }
}
