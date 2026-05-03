import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

        return;
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
    
        merge(arr, start, mid, end);
    }
    
    public static void merge(int[] arr, int s, int m, int e ) {
        int[] ary = new int[e-s];
        int i=s, j=m, k=0;

        while (i<m && j<e) {
            if (arr[i]<arr[j]) {
                ary[k++] = arr[i++];
            }
            else {
                ary[k++] = arr[j++];
            }
        }

        while(i<m) {
            ary[k++] = arr[i++];
        }

        while(j<e) {
            ary[k++] = arr[j++];
        }

        for(int ii=0;ii<ary.length;ii++) {
            arr[s+ii] = ary[ii];
        }
    }
    
}
