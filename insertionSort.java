public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 7, 9, 6, 2 };

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; 
                j--;
            }
            arr[j + 1] = temp; 

            System.out.println("After inserting " + temp + ":");
            for (int ii = 0; ii < arr.length; ii++)
                System.out.print(arr[ii] + " ");
            System.out.println();
        }

        System.out.println("\nSorted array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
