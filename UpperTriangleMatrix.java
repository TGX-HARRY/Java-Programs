public class UpperTriangleMatrix {
    public boolean isUpperTriangular(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < Math.min(i, cols); j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UpperTriangleMatrix utm = new UpperTriangleMatrix();
        int[][] matrix = {
            {1, 2, 3},
            {0, 5, 6},
            {0, 0, 9}
        };
        boolean result = utm.isUpperTriangular(matrix);
        System.out.println("Is the matrix upper triangular? " + result);

        return;
    }
}
