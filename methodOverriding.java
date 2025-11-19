public class methodOverriding {
    public static class BANK {
        void interest() {
            System.out.println("The interest rate is 5%");
        }
    }

    public static class SBI extends BANK {
        void interest() {
            System.out.println("Server error: 404 Usual Stuff");
        }
    }
   
    public static class BOI extends BANK {
        void interest() {
            System.out.println("The interest rate is 8%");
        }
    }

    public static class ICICI extends BANK {
        void interest() {
            System.out.println("The interest rate is 9%");
        }
    }

    public static void main(String[] args) {
        BANK b = new BANK();
        System.out.print("BANK: ");
        b.interest();

        BANK b2 = new SBI();
        System.out.print("SBI: ");
        b2.interest();

        BANK b3 = new BOI();
        System.out.print("BOI: ");
        b3.interest();

        BANK b4 = new ICICI();
        System.out.print("ICICI: ");
        b4.interest();
        
        return;
    }
}
