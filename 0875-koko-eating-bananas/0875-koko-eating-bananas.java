class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    //     int left = 1;
    //      int ans = 0;
    //      int right = 0;

    //      for(int i=0; i<piles.length; i++){
    //        int right1 = piles[i];
    //       right = Math.max(right1, right); 
    //      }

    //     while(left <= right){
           
    //       long  TotalHour = 0;

    //       int mid = (left + right) / 2;

    //      for(int i=0; i<piles.length; i++){
    //             long pile = piles[i];
    //             long finish = (pile+mid-1)/mid;
    //              TotalHour += finish;

    //         }

    //           if(TotalHour <= h){
    //               ans = mid;
    //           right = mid -1;
    //           }

    //           else{
    //            left = mid + 1;
    //           }
    //     }
    //     return ans;


    int s = 0;
    int e = 0;
    int ans = 0;
    int n = piles.length;
    long sum = 0;
    int mid;
   

    for(int i = 0 ; i<n ; i++){
      sum = sum +  piles[i];
      e = Math.max(e , piles[i]);
    }

    s =  (int)( sum/h);

    if(s == 0){
        s = 1;
    }

    while(s <= e){
         mid = s+(e-s)/2;

         int total_time = 0;

      for(int i = 0 ; i< n ; i++){
        total_time = total_time + piles[i]/mid;

        if(piles[i] % mid != 0){
            total_time = total_time+1;
        }
      }


        if(total_time <= h){
            ans = mid;
            e = mid-1;
        }
        else{
            s = mid+1;
        }
      
        
    }


return ans;




    }
}