class Solution {

   public void permut(int nums[],List<List<Integer>> ans,int index){
    if(index == nums.length){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            temp.add(nums[i]);
        }
        ans.add(temp);
        return;
    }

    for(int i=index; i<nums.length; i++){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;

        permut(nums, ans, index+1);

          temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;

    }
   }


    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();

       permut(nums, ans, 0);
       return ans;
    }
}