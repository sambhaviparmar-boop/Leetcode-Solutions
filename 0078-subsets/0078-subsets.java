class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        subsets(nums, ans,current, 0);

        return ans;
    }

    public void subsets(int[] nums, List<List<Integer>> ans,List<Integer> current,  int i) {
        
        if(i == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }

        //include....
        current.add(nums[i]);
        subsets(nums , ans, current, i+1);

        //exclude
        current.remove(current.size()-1);
        subsets(nums, ans, current, i+1);

    }
}