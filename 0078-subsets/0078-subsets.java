class Solution {

    public List<List<Integer>> subsets(int[] nums) {
      
       List<Integer> temp = new ArrayList<>();
     List<List<Integer>> ans = new ArrayList<>();

      subsets(nums, 0 , ans , temp);

        return ans;
    }

    public void subsets(int[] nums,int i,  List<List<Integer>> ans,List<Integer> temp) {
        
       if(i == nums.length){
          ans.add( new ArrayList<>(temp));
          return ;
       }
 

    //no
    subsets(nums, i+1, ans, temp);

    //yes
    temp.add(nums[i]);
    subsets(nums, i+1, ans , temp);
 
    temp.remove(temp.size()-1);

    }
}