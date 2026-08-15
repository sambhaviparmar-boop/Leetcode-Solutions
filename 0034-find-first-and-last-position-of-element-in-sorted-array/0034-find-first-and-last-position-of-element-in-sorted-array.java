class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int start = 0;
        int end = nums.length - 1;
        int firstApp = -1;
        int secondApp = -1;

        while (start < end + 1) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                firstApp = mid;
                end = mid - 1;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            }

            else if (nums[mid] > target) {
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while (start < end + 1) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {

                secondApp = mid;
                start = mid + 1;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            }

            else if (nums[mid] > target) {
                end = mid - 1;
            }
        }

        arr[0] = firstApp;
        arr[1] = secondApp;
        return arr;
    }
}