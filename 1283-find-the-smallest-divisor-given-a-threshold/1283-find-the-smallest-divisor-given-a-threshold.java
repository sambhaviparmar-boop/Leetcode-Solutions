class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // int left = 1;
        // int right = 0;
        // int ans = -1;
       

        // for (int i = 0; i < nums.length; i++) {
        //      right = Math.max(nums[i], right);
        // }

        // while (left <= right) {
        //      int sum = 0;
        //     int mid = (left + right) / 2;
        //     int divisor = mid;
        //     for (int i = 0; i < nums.length; i++) {
        //         int value = (nums[i] + divisor - 1) / divisor;

        //           sum += value;
        //     }
          

        //     if (sum <= threshold){
        //        ans = mid;
        //         right = mid - 1;
        //     }
        //     else{
        //         left = mid + 1;
        //     }
        // }
        // return ans;





        int s = 1;
        int e = 0;
        int mid;
        int sum = 0;
        int ans = 0;


        for(int i = 0 ; i< nums.length ; i++){
          
            e = Math.max(e , nums[i]);
        }
        // s = sum / threshold;

        if(s == 0){
            s = 1;
        }


        while(s <= e){
            mid = s+(e-s)/2;

           int total = 0;

           for(int i = 0; i<nums.length ; i++){
              total = total + nums[i]/mid;

              if(nums[i] % mid != 0){
                total++;
              }
           } 
        
        if(total > threshold){
            s = mid+1;
        }
        else{
            ans = mid;
            e = mid-1;
        }
        }
        return ans;
    }
}