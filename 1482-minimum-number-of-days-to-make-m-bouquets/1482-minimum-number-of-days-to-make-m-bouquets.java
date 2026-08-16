class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       int left = 1;
       int right=0;
       int ans = -1;

       for(int i=0; i<bloomDay.length; i++){

          right =  Math.max(right, bloomDay[i]);
          
       } 
       if((long)m*k >  bloomDay.length){
                return -1;
            }

       while(left <= right){
         int mid = (left + right)/2;
         long count = 0;
          long bouquets = 0;

           


        for(int i = 0; i < bloomDay.length; i++) {

          if(bloomDay[i] <= mid){
          count++;
          
            if(count == k) {
                bouquets++;
                count = 0;
            }  
        }
        else{
        count = 0;
        }
         } 
         if(bouquets >= m){
            ans = mid;
            right = mid - 1 ;

         }else{
            left = mid + 1;
         }
       } 
       return ans;
    }
}