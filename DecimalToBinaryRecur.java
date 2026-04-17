public class DecimalToBinaryRecur {
    public static void main(String[] args) {
        int test = 43;
        System.out.println(decToBin(test));
        return;
    }

    public static int decToBin(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            return decToBin(n/2) * 10 + (n%2);
    }
}
