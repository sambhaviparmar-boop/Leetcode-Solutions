class Solution {
    public int[] findErrorNums(int[] nums) {
        //repeatd number milgya
        int n = nums.length;
        int repeat = 0;
        int next = 0;

        for(int i = 0; i<n ; i++){
          for(int j = i+1; j<n ; j++){
            if(nums[i] == nums[j]){
                repeat = nums[i];
            }
          }
        }
        

//index find krenge isse 
     
     for(int i = 1; i<= n ; i++){
        boolean found = false;

        for(int j = 0; j< n ; j++){
            if(nums[j] == i){
                found = true;
                break;
            }
        }
        if(!found){
            next = i;
        }
     }
        return new int[]{repeat , next};
    }
}