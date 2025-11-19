public class selectionSort {
    public static int getMinPos(int[] arr, int start) {
        int min = arr[start];
        int r = start;
        for(int i=start;i<arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
                r = i;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,9,7,6,8,5,4};
        int min;
        for(int start=0;start<arr.length;start++) {
            min = getMinPos(arr, start);
            int temp = arr[start];
            arr[start] = arr[min];
            arr[min] = temp;    
        }
        for(int i=0;i<arr.length;i++) {System.out.print(arr[i] + ", ");}
    }
}
