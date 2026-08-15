class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length;

        while(start<end-1){
            int mid = (start + end)/2;

            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] == nums[mid+1]){
                 start = mid + 2;
            }
            else{
                end = mid;
            }
        }
        if(start == end){
            return nums[start];
        }
        return nums[start];
    }
}