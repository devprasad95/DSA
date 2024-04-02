class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            int num = Integer.MAX_VALUE;
            int index = -1;
            for(int j= 0; j<n; j++){
                  if(matrix[i][j]<num){
                    num = matrix[i][j];
                    index = j;
                  }
            }
            boolean flag = true;
            for(int row = 0; row <m; row++){
                if(num < matrix[row][index]){
                    flag = false;
                    break; 
                }
            }
            if(flag){
                list.add(num);
            }
            
        }
        return list;
    }
}
