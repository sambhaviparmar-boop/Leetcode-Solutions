class Solution {
    public int mostFrequentEven(int[] nums) {
      int maxFreq = 0;
      int ans = -1;

      for(int i=0 ; i<nums.length; i++){
        int count = 0;

        for(int j=0 ; j<nums.length ; j++){
            if(nums[i] %2 ==0){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }

        if(maxFreq<count){
            maxFreq = count;
            ans = nums[i];
        }
        else if(maxFreq == count && ans>nums[i]){
            ans = nums[i];
        }
      }
      return ans;
    }
}