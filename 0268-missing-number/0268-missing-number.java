class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;

       //cyclic Sort
        while(i < nums.length){
          int curr = nums[i];  
         
          if(nums[i] < nums.length && nums[i] != nums[curr]){
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }
            else{
                i++;
            }
        }

       //again check
        for(int j =0 ; j<nums.length ; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return i;
    }
}