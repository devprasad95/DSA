class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<Integer>();
        if(m == 0) return result;
        int rowStart = 0, colStart = 0, rowEnd = m - 1, colEnd = n -1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart; i <= colEnd; i++){
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i = rowStart; i <= rowEnd; i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd){
                for(int i = colEnd; i >= colStart; i--){
                result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }         
            if(colStart <= colEnd){
                for(int i = rowEnd; i >=  rowStart; i--){
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }  
        }
        return result;
    }
}
