class Solution {

   public void permut(int nums[],List<List<Integer>> ans, List<Integer> temp,boolean[] visited  ){


    //base case
    if(nums.length == temp.size()){
        ans.add(new ArrayList<>(temp));
        return;
    }

    for(int i=0 ; i<nums.length; i++){

        if(!visited[i]){
            visited[i] = true;
            temp.add(nums[i]);

            permut(nums, ans , temp, visited);

           //for backtracking
            visited[i] = false;
            temp.remove(temp.size()-1);
        }
    }

    
   }


    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> temp = new ArrayList<>();
      boolean[] visited = new boolean[nums.length];

       permut(nums , ans , temp ,visited );

       return ans;
    }
}