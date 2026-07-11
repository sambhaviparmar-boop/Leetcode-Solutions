class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int first = 0;
        int last = n - 1;
        while (first <= last) {

            int mid = (first + last) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[mid] >= nums[first]) {
                if (target >= nums[first] && target < nums[mid]) {
                    last = mid - 1;
                } else{
                    first = mid + 1;
                }
            } else if (nums[mid] <= nums[last]) {
                if (target > nums[mid]  && target <= nums[last]) {
                    first = mid + 1;

                } else {
                    last = mid - 1;
                }
            }
        }
        return -1;
    }
}