public class quickSortClass {
    public static int getPivot(int[] arr, int start, int end) {
        int pivot = arr[end];
        int k = -1;
        for(int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                k++;
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        int temp1 = arr[k + 1];
        arr[k + 1] = arr[end];
        arr[end] = temp1;

        return k+1;
    }

    public static void doQuickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = getPivot(arr, start, end);

        doQuickSort(arr, start, mid-1);
        doQuickSort(arr, mid+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8};
        doQuickSort(arr, 0, arr.length-1);
        return;
    }
}
