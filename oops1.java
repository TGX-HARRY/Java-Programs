import java.util.Scanner;
// a package in java is a mechanism that encapsulates 
// a group of related classes, subpackages and interfaces
class ADD {
    private int num1;
    private int num2;
    private int num3;

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        sc.nextInt();
        sc.nextInt();
        num3 = num1 + num2;
        sc.close();
    }

    public void display() {
        System.out.println(num3);
    }
}

public class oops1 {
    public static void main(String[] args) {
        ADD obj = new ADD();
        obj.add();
        obj.display();
    }
}
