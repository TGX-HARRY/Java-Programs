
class ohkay {
    int x = 1;
    public int y = 0;
    protected int z = 3;
    @SuppressWarnings("unused")
    private int a = 4;
    ohkay() {
        System.out.println("Constructor of class");
    }
}

public class oops2 {
    public static void main(String[] args) {
        // Access Modifiers : access modifieer deteremines whether other classes can use 
        // a particular field or invoke a particular method
        ohkay obj = new ohkay(); // constructor is called when an object of a class is created
        // System.out.println(obj.a); // private members are not accessible outside the class
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
    }
}
