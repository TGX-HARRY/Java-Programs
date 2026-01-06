public class MakeArrayPositive {
    public static int makePositive(int[] arr) {
        // {-1,2,-3,4,5,-6}
        int size = arr.length;
        int count = 0;
        int prevSign = (arr[0]>0)?1:-1;
        if(prevSign == -1) count++;
        for(int i=1;i<size;i++) { 
            int currSign = (arr[i]>0)?1:-1;
            if (prevSign != currSign) {
                count++;
                prevSign = currSign;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,5,-6};
        System.out.println("Minimum operations to make array positive: " + makePositive(arr));
        return;
    }
}