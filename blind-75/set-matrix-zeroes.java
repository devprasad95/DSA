class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;
        //Check whether first row and col have any zero
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 0) rowZero = true; 
        }
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0) colZero = true;
        }
        // we will store this value for future refrence
        // Next we will mark 0 value in 0th row and col
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // then based on the zero value in 0th row and zero we will make values from index i to zero
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){ 
                    matrix[i][j] = 0;
                }
            }
        }
        // now we can update first row and col
        if(rowZero){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        if(colZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
