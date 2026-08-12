class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
       
         int n = nums.length;
          Arrays.sort(nums);
        for(int i=0; i<n; i++){
            int target = -(nums[i]);
             HashSet<Integer> set1 = new HashSet<>();
            for(int j= i+1 ; j<n ; j++){
              int toFind = target - nums[j];
             
            if (set1.contains(toFind)){
                set.add(Arrays.asList(nums[i], nums[j], toFind));
             }
                set1.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}