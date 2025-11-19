import java.util.ArrayList;
import java.util.Scanner;

public class elementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        
        System.out.println("Initial list: " + list);

        for(Integer i: list) {
            int frequency = 0;
            for(Integer j: list) {
                if(i.equals(j)) {
                    frequency++;
                }
            }
            System.out.println("Element " + i + " occurs " + frequency + " times");
        }
    }
}