class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // int left = 0;
        // int right = 0;
        // int sum = 0;

        // for(int i=0; i<weights.length; i++){
        //   left = Math.max(left, weights[i]);


        //     sum += weights[i];
           
        // }
        //  right = sum;

        

        // while(left <= right){
        //     int mid = (left + right)/2;

        //     int dayUsed = 1;
        //     int currentLoad = 0;

        //     for(int i=0; i<weights.length; i++){

        //   if(currentLoad + weights[i] <= mid){
        //     currentLoad  += weights[i];
        //   }

        //    else{
        //     dayUsed++;
        //     currentLoad = weights[i];
        //    }
        // }
        //   if(dayUsed <= days){
        //         right = mid-1;
        //   }
        //   else{
        //     left = mid+1;
        //   }

        // }
        // return left;












        int s = 0;
        int e = 0;
        int sum = 0;

        for(int i = 0 ; i< weights.length ; i++){
            s = Math.max(s , weights[i]);

            sum = sum + weights[i];
        }
          e = sum;

          while( s <= e){
            int mid = s+(e-s)/2;

            int dayUsed = 1;
            int currentLoad = 0;
 
           for(int i = 0 ; i< weights.length ; i++){
           
            if(currentLoad + weights[i] <= mid){
                currentLoad += weights[i];
            }
            else{
                dayUsed++;
                currentLoad = weights[i];
            }
           }

           if(dayUsed <= days){
            e = mid-1;

           }
           else{
            s = mid+1;
           }
          }
          return s ;
    }
}


//within-(book allocation pattern)