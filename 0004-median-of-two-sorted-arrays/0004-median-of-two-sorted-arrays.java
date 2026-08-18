class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int m = nums1.length;
          int n = nums2.length;
          double median;
          int[] arr = new int[m+n];

        for(int i=0; i<nums1.length; i++){
             arr[i] = nums1[i];

        }

        for(int j=0; j<nums2.length; j++){
             arr[m+j] = nums2[j];

        }
        Arrays.sort(arr);


        if(arr.length % 2 != 0) {
          median = arr[arr.length / 2];
       }
        else {
         median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }

      
         return  median;
    }
}