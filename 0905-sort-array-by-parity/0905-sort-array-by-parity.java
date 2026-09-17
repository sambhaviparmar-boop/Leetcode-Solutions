class Solution {
    public int[] sortArrayByParity(int[] nums) {
     
     int[] arr = new int[nums.length];
      int index = 0;

         //even number
        for(int i = 0; i<nums.length; i++){

            if(nums[i] % 2 == 0){
              arr[index] = nums[i];  
              index++;
            }
        }

        // odd number
         for(int i = 0; i<nums.length; i++){

            if(nums[i] % 2 != 0){
              arr[index] = nums[i];  
              index++;
            }
        }
        return arr;
    }
}