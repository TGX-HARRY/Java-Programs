import java.util.HashSet;

public class MakeZeroes {
    public static void ZeroMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> ignoreRow = new HashSet<>();
        HashSet<Integer> ignoreCols = new HashSet<>();
        for(int i=0;i<rows;i++) {
            for(int j = 0;j<cols;j++) {
                if (matrix[i][j] == 0) {
                    ignoreRow.add(i);
                    ignoreCols.add(j);
                }
            }
        }
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if (ignoreRow.contains(i) || ignoreCols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
