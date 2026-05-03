public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        int test = 12345;
        int sum = recurse(test);
        System.out.println(sum);
    }
    public static int recurse(int num) {
        if (num == 0) return 0;
        return num%10 + recurse(num/10);
    }
}
