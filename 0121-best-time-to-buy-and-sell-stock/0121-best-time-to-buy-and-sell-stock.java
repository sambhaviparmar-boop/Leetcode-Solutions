class Solution {
    public int maxProfit(int[] arr) {
       int maxProfit = 0;
       int BB = arr[0];

       for(int i=1; i<arr.length; i++){

          if(arr[i] > BB){
            maxProfit = Math.max(maxProfit , arr[i]-BB);
          }
          BB = Math.min(BB, arr[i]);
       }
       return maxProfit;
    }
}