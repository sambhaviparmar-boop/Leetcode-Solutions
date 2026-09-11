class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> LMax = new ArrayList<>();
         ArrayList<Integer> RMax = new ArrayList<>();

          LMax.add(nums[0]);
          RMax.add(nums[n-1]);

         for(int i=1; i<nums.length; i++){
            LMax.add(Math.max(nums[i], LMax.get(i-1)));
         }

          for(int i=n-2; i>=0; i--){
            RMax.add(Math.max(nums[i], RMax.get(n-2-i)));
         }
         
         int ans = 0;

         for(int i=0; i<nums.length; i++){
              ans += Math.min(LMax.get(i) , RMax.get(n-1-i))-nums[i];
         }
       return ans;
    }
}