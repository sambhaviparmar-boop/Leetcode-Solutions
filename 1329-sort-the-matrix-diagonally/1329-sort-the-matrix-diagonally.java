import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public int[][] diagonalSort(int[][] mat) {

        // Top row se start hone wali diagonals
        for (int col = 0; col < mat[0].length; col++) {
            sortDiagonal(mat, 0, col);
        }

        // Left column se start hone wali diagonals
        for (int row = 1; row < mat.length; row++) {
            sortDiagonal(mat, row, 0);
        }

        return mat;
    }

    private void sortDiagonal(int[][] mat, int row, int col) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = row;
        int j = col;

        // Collect diagonal elements
        while (i < mat.length && j < mat[0].length) {
            list.add(mat[i][j]);
            i++;
            j++;
        }

        // Sort
        Collections.sort(list);

        // Reset indices
        i = row;
        j = col;

        int k = 0;

        // Fill back
        while (i < mat.length && j < mat[0].length) {
            mat[i][j] = list.get(k);
            i++;
            j++;
            k++;
        }
    }
}