// 1st method
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int k = 0; k < 4; k++) {
            int[][] result = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = mat[j][n - i - 1];
                }
            }
            if (equals(target, result)) {
                return true;
            }
            mat = result;
        }
        return false;
    }

    private boolean equals(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
//2nd method
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(equals(mat,target)){
            return true;
        }
        int n = mat.length;
        int[][] temp = new int[n][n];
        for(int k = 0; k < 3; k++){
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    temp[i][j] = mat[j][n-1-i];
                }
            }
            if(equals(temp,target)){
                return true;
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    mat[i][j] = temp[i][j];
                }
            }
        }
        return false;
    }
    public boolean equals(int[][] a, int[][] b){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
