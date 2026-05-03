import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicates {
   public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arraylist: ");
        int size = sc.nextInt();
        while (size!=0) {
            Integer elem = sc.nextInt();
            if (list.add(elem))  System.out.println(elem + " added to arraylist");
            size--;
        }
        sc.close();

        System.out.println("Initial list: " + list);   
        Set<Integer> set = Set.copyOf(list); 
        System.out.println("Set after removing duplicates: " + set);
        
        // ArrayList<Integer> newList = new ArrayList<Integer>();
        // for (Integer elem : list) {
        //     if (!newList.contains(elem)) {
        //         newList.add(elem);
        //     }
        // }
        // System.out.println("List after removing duplicates: " + newList);
        return;
    }
}
