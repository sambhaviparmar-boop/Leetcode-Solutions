class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        int e = 0;
        int mid;
        int sum = 0;
        int ans = 0;


        for(int i = 0 ; i< nums.length ; i++){
            e = Math.max(e , nums[i]);
        }
        // s = sum / threshold;

        // if(s == 0){
        //     s = 1;
        // }


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