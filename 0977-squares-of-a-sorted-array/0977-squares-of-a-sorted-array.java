class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[nums.length];
        int left = 0;
        int right = n-1;
        int index = n-1;
        for(int i=0; i<n; i++){
          int leftSqaure = nums[left] * nums[left];
           int rightSquare = nums[right] * nums[right];
           
            if(leftSqaure>rightSquare){
            ans[index] = leftSqaure;
            left++;
            index--;
        }
        else{
           ans[index] = rightSquare;
            right--;
            index--;
        }
        }
        return ans;
    }
}