class Solution {
    public int maxProduct(int[] nums) {
        int currentProduct = 1;
        int minProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length ; i++){
            int temp = currentProduct;

            currentProduct = Math.max(nums[i], Math.max(currentProduct * nums[i], minProduct * nums[i]));


            minProduct = Math.min(nums[i], Math.min(temp * nums[i], minProduct * nums[i]));


            maxProduct = Math.max(maxProduct , currentProduct);

        }
        return maxProduct;
    }
}