import java.util.*;

public class TestpadOOPS33 {
    static class TollBooth {
        private int totalNumberOfCars;
        private int totalMoneyCollected;

        public TollBooth() {
            this.totalNumberOfCars = 0;
            this.totalMoneyCollected = 0;
        }

        public void payingCar() {
            totalNumberOfCars += 1;
            totalMoneyCollected += 50;
        }

        public void nopayCar() {
            totalNumberOfCars += 1;
        }

        public void display() {
            System.out.println("Total Cash : " + totalMoneyCollected + "/-");
            System.out.println("Total Cars : " + totalNumberOfCars);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBooth tollbooth = new TollBooth();
        while (true) {
            char input = sc.next().charAt(0);
            if (input == 'p')  tollbooth.payingCar();
            if (input == 'n') tollbooth.nopayCar();
            if (input == 'q') break;
        }
        sc.close();
    }
}