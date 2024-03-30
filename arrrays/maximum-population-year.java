class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i = 0; i <logs.length; i++){
            for(int j = logs[i][0]; j< logs[i][1];j++){
                arr[j-1950]++;
            }
        }
        int x = arr[0];
        int year = 1950;

        for(int i = 0; i < 101; i++){
            if(arr[i]>x){
                x = arr[i];
                year = i + 1950;
            }
        } 
        return year;  
    }
}
