import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter the size of arraylist: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        while (size!=0) {
            Integer elem = sc.nextInt();
            if (list.add(elem))  System.out.println(elem + " added to arraylist");
            size--;
        }
        
        System.out.println("Initial list: " + list);

        if (!list.isEmpty()) 
            System.out.println("Element at index 0: " + list.get(0));
        

        if (!list.isEmpty()) {
            list.set(0, 999);
            System.out.println("After set(0, 999): " + list);
        }
        list.add(1, 555);
        System.out.println("After add(1, 555): " + list);
        if (!list.isEmpty()) {
            list.remove(0);
            System.out.println("After remove(0): " + list);
        }
        System.out.println("List contains 555: " + list.contains(555));
        System.out.println("Index of 555: " + list.indexOf(555));
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is list empty after clear? " + list.isEmpty());

        sc.close();
        return;
    }

}
