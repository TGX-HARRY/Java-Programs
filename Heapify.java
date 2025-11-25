public class Heapify {
    public static void heapify(int[] array, int i, int n) {
        // get indices of left and right children
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        // compare left and right to find the largest of this subtree
        if (left < n && array[left] > array[largest]) {
            largest = left; // largest index is now of left child
        }

        if (right < n && array[right] > array[largest]) {
            largest = right; // largest index is now of right child
        }

        // if largest is not parent/root, swap the values and move up the tree
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, largest, n);
        }

        // end the recursion
        return;
    }

    public static void main(String[] args) {
        //  minheap
        int[] array = {3, 5, 1, 10, 2, 7, 6, 4, 8, 9};
        for (int i = (array.length / 2) -1; i >= 0; i--) {
            heapify(array, i, array.length);
        }
        // as we consider the heap as tree, we need not to traverse whole array in loop
        // as half *2 + 1 or 2 will exceed the length of array
        System.out.println("Heapified array: ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        return;
    }
}


