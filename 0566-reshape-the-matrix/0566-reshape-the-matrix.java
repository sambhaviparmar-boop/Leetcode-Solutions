class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        // Reshape possible nahi hai
        if (rows * cols != r * c) {
            return mat;
        }

        // Step 1: Flatten
        int[] flat = new int[rows * cols];
        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flat[k++] = mat[i][j];
            }
        }

        // Step 2: Create reshaped matrix
        int[][] ans = new int[r][c];

        int index = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = flat[index++];
            }
        }

        return ans;
    }
}