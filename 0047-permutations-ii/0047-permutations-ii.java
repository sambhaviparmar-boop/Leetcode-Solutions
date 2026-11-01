class Solution {
     void permute(int[] nums, List<List<Integer>> ans , int index){

       //base case
       if(index == nums.length){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0 ; i<nums.length ; i++){
            temp.add(nums[i]);
        }
        ans.add(temp);
        return;
       }


       boolean[] use = new boolean[21];

       for(int i=index ; i<nums.length; i++){
           
           if(!use[nums[i]+10]){

            use[nums[i] + 10] = true;

             int temp = nums[index];
             nums[index] = nums[i];
             nums[i] = temp;
           

           permute(nums, ans , index+1);

        //for backtracking again swap
             temp = nums[index];
             nums[index] = nums[i];
             nums[i] = temp;


             
           }
       }



     }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, ans , 0);
        return ans;
    }
}