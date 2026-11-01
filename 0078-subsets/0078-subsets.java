class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
       List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        solve(nums , ans , temp , nums.length , 0);

        return ans;

     
    }

 public void solve( int nums[] ,  List<List<Integer>> ans,  ArrayList<Integer> temp , int n , int i){

    //base case
   if(i == n){
     ans.add(new ArrayList<>(temp));
     return;
   }


    //include
    temp.add(nums[i]);
    solve(nums , ans , temp , n , i+1);
   


    //exclude
    temp.remove(temp.size()-1);
      solve(nums , ans , temp , n , i+1);

 }   
}