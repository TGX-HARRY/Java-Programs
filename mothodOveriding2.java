public class mothodOveriding2 {
    public static class Cricketer {
        void show() {
            System.out.println("I am a Cricketer");
        }
    }

    public static class ViratKolhi extends Cricketer {
        void show() {
            System.out.println("I am Virat Kolhi");
        }
    }

    public static class RohitSharma extends Cricketer {
        void show() {
            System.out.println("I am Rohit Sharma");
        }
    }

    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.show();

        Cricketer c2 = new ViratKolhi();
        c2.show();

        Cricketer c3 = new RohitSharma();
        c3.show();

        return;
    }
}
