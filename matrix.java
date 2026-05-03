public class matrix {
    public static int findd(int[][] count, int target) {
        for (int i = 0; i < count.length; i++) {
                if (count[i][0] == target) return i;
        }
        return -1;
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 17, 2, 6, 9, 17, 2, 6, 9, 1, 3, 7, 2, 17, 2, 6, 9};
        int[][] count = new int[arr.length][2];
        int rows = 0;
        for(int i: arr) {
            int index = findd(count, i);
            if (index != -1) {
                count[index][1]++; 
            }
            else {
                count[rows][0] = i;
                count[rows][1] = 1;
                rows++;
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println("Element: " + count[i][0] + " Count: " + count[i][1]);
        }
}
}
