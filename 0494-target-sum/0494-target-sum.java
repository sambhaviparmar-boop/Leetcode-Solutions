class Solution {

    public int subset(int nums[],int index, int target, int n){

     if(index == n){
        if(target == 0) return 1;
        else return 0;
     }

       return subset(nums, index+1, target+nums[index], n) + subset(nums, index+1, target-nums[index], n);
    }



    public int findTargetSumWays(int[] nums, int target) {
        return subset(nums, 0 , target, nums.length);
    }
}