class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
      ArrayList<Integer> curr = new ArrayList<>();
     List<List<Integer>> ans = new ArrayList<>();
      

      solve(ans , curr , nums , 0);
      return ans;
    }

 public void solve( List<List<Integer>> ans,ArrayList<Integer> curr, int[] nums , int i){

    //base case
    if(i == nums.length){
         ans.add(new ArrayList<>(curr));
         return;
    }


    //include
    curr.add(nums[i]);
    solve(ans , curr , nums , i+1);


    //exclude
    curr.remove(curr.size()-1);
     solve(ans , curr , nums , i+1);

 }   
}