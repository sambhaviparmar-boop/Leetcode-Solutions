class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] nums = new int[k];
        int count = 0;
      for(int i=1; count<k; i++){
        boolean found = false;

        for(int j=0; j<arr.length; j++){
              if(arr[j] == i){
                found = true;
                break;
              }
        }
        if(!found){
            nums[count] = i;
            count++;
        }

        
        


      }
     return nums[k-1];
    }
}