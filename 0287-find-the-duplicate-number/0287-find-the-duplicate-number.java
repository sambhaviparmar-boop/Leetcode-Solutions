class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int curr = nums[i]-1;

            if(nums[i] != nums[curr]){
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<n; j++){
            if(nums[j] != j+1){
               return nums[j];  
           
            }
        }
      return -1;
    }
}