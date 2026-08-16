class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
         int ans = 0;
         int right = 0;

         for(int i=0; i<piles.length; i++){
           int right1 = piles[i];
          right = Math.max(right1, right); 
         }

        while(left <= right){
           
          long  TotalHour = 0;

          int mid = (left + right) / 2;

         for(int i=0; i<piles.length; i++){
                long pile = piles[i];
                long finish = (pile+mid-1)/mid;
                 TotalHour += finish;

            }

              if(TotalHour <= h){
                  ans = mid;
              right = mid -1;
              }

              else{
               left = mid + 1;
              }
        }
        return ans;
    }
}