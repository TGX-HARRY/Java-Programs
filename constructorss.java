class A {
    public int val;
    public A() {
        System.out.println("Default Constructor called and initialized with value " + val);
    }
    public A(int val) {
        this.val = val;
        System.out.println("Parameterized constructor with value " + this.val + " called");
    }
    public A(A obj) {
        System.out.println("Copy Constructor called with obj having value " + obj.val);
    }
}

public class constructorss {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A o = new A();
        A ob = new A(12);
        A obj = new A(ob);
        
    }
}