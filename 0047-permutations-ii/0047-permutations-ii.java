class Solution {
     void permute(int[] nums, List<List<Integer>> ans , int index){

    if(index == nums.length){
        List<Integer> temp = new ArrayList<>();

        for(int num : nums){
            temp.add(num);
        }
        ans.add(temp);
        return;
    }


        int[] use = new int[21];

        for(int i=index; i<nums.length; i++){

            if(use[nums[i] + 10] == 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                permute(nums, ans, index+1);

                int temp1 = nums[i];
                nums[i] = nums[index];
                nums[index] = temp1;

                use[nums[i]+10] = 1;

            }
        }
     }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, ans , 0);
        return ans;
    }
}