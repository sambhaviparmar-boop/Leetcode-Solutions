class Solution {

    public int[] partition(int arr[], int start, int end) {

        int randomIndex = start + (int)(Math.random() * (end - start + 1));

        int temp = arr[randomIndex];
        arr[randomIndex] = arr[end];
        arr[end] = temp;

        int pivot = arr[end];

        int low = start;
        int mid = start;
        int high = end;

        while (mid <= high) {

            if (arr[mid] < pivot) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            else if (arr[mid] > pivot) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }

            else {
                mid++;
            }
        }

        // low to high = elements equal to pivot
        return new int[]{low, high};
    }


    public int quickSelect(int arr[], int start, int end, int k) {

        int target = arr.length - k;

        while (start <= end) {

            int[] range = partition(arr, start, end);

            int left = range[0];
            int right = range[1];

            if (target >= left && target <= right) {
                return arr[target];
            }

            else if (target < left) {
                end = left - 1;
            }

            else {
                start = right + 1;
            }
        }

        return -1;
    }


    public int findKthLargest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k);
    }
}