class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] dirs = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};
        int index = 0, d = 0, length = 0;
        while(index < rows * cols){
            if(d == 0 || d == 2){
                length++;
            }
            for(int k = 0; k < length; k++){
                if(rStart < rows && rStart >= 0 && cStart < cols && cStart >= 0){
                    result[index++] = new int[] {rStart, cStart};
                }
                rStart += dirs[d][0];
                cStart += dirs[d][1];   
            }
            d = (d + 1) % 4;
        } 
        return result;
    }
}
