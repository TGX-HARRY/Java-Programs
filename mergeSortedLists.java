import java.util.ArrayList;
import java.util.Random;

public class mergeSortedLists {
    public static ArrayList<Integer> 
    merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        int l1 = 0, l2 = 0;
        int el1, el2;
        while (l1 < list1.size() && l2 < list2.size()) {
            el1 = list1.get(l1);
            el2 = list2.get(l2);
            if (el1 < el2) {
                if (list3.isEmpty() || list3.get(list3.size() - 1) != el1) list3.add(el1);
                l1++;
            } else {
                if (list3.isEmpty() || list3.get(list3.size() - 1) != el2) list3.add(el2);
                l2++;
            }
        }

        while (l1 < list1.size()) 
            list3.add(list1.get(l1++));
        

        while (l2 < list2.size()) 
            list3.add(list2.get(l2++));

        return list3;
    }

    public static ArrayList<Integer> 
    mergeSort(ArrayList<Integer> list, int start, int end) {
        if (start >= end) {
            ArrayList<Integer> base = new ArrayList<>();
            base.add(list.get(start));
            return base;
        }
        
        int mid = start + (end-start)/2;
        // 3 2 1 4
        ArrayList<Integer> left = mergeSort(list, start, mid);
        ArrayList<Integer> right = mergeSort(list, mid+1, end);

        return merge(left, right);
    }

    public static void main(String[] args) {
       int n = 10; // size of list
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        // Generate random integers between 1 and 100
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(100) + 1);
        }

        System.out.println("Unsorted List: " + list);

        list = mergeSort(list, 0, list.size()-1);

        System.out.println("Sorted List:   " + list);
    }
}
