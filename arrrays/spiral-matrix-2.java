class Solution {
    public int[][] generateMatrix(int n) {
      int[][] result = new int[n][n];  
      int rowStart = 0, colStart = 0, rowEnd = n - 1, colEnd = n - 1;
      int num = 1;
      while(rowStart <= rowEnd && colStart <= colEnd){
         for(int i = colStart; i <= colEnd; i++){
            result[rowStart][i] = num++;
         }
         rowStart++;
         for(int i = rowStart; i<= rowEnd; i++){
            result[i][colEnd] = num++;
         }
         colEnd--;
         if(rowStart <= rowEnd){
            for(int i = colEnd; i >= colStart; i--){
                result[rowEnd][i] = num++;
            }
         }
         rowEnd--;
         if(colStart <= colEnd){
            for(int i = rowEnd; i >= rowStart; i--){
                result[i][colStart] = num++;
            }
         }
         colStart++;
      }
      return result;
    }
}
