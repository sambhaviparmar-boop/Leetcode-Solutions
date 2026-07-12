class Solution {
    public int maximumWealth(int[][] arr) {
       int maxwealth = 0;
        for(int i=0; i<arr.length; i++){
             int sum = 0;


            for(int j=0; j<arr[i].length; j++){
            sum = sum + arr[i][j];
            }

            if(sum > maxwealth){
            maxwealth = sum;
        }
        }
        
        return maxwealth;
    }
}