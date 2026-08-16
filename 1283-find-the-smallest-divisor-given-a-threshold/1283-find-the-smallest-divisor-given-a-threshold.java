class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        int ans = -1;
       

        for (int i = 0; i < nums.length; i++) {
             right = Math.max(nums[i], right);
        }

        while (left <= right) {
             int sum = 0;
            int mid = (left + right) / 2;
            int divisor = mid;
            for (int i = 0; i < nums.length; i++) {
                int value = (nums[i] + divisor - 1) / divisor;

                  sum += value;
            }
          

            if (sum <= threshold){
               ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}