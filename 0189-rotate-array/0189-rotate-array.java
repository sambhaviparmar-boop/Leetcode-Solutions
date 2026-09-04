class Solution {
    public void reverse(int i, int j, int[] arr) {
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
      public void rotate(int[] nums, int k){

         k = k % nums.length;

        reverse(0, nums.length-k-1, nums);
        reverse(nums.length-k, nums.length-1, nums);
        reverse(0, nums.length-1, nums);
    
    

      }
}