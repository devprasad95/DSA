
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
      
        /* 
        Firstly will have to check if the product of dimension of the given array matrix(mat)
        and the product of dimensions of the new array matrix are eqaul. If they are not equal
        this means we cannot fill all the elements perfectly in one of the matrix hence in this
        condition, will have to return the original array.
        */
      
        if(m * n !=  r * c){
            return mat;
        }
      
        int[][] result =  new int[r][c];
        int newRow = 0;
        int newCol = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                result[newRow][newCol] = mat[i][j];
                newCol++;
                if(newCol == c){
                    newCol = 0;
                    newRow++;
                }
                
            }
        }
        return result;
    }
}
