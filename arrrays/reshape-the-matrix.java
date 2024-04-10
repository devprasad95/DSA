class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c)
            return mat;
        else if (m == r && n == c)
            return mat;
        else {
            int[][] result = new int[r][c];
            int newRow = 0;
            int newCol = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[newRow][newCol] = mat[i][j];
                    newCol++;
                    if (newCol == c) {
                        newCol = 0;
                        newRow++;
                    }
                }
            }
            return result;
        }
    }
}
