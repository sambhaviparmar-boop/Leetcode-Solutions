class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int longest = 0;

       for(int elem : nums){
        set.add(elem);
       }


       for(int elem : set){
          if(!set.contains(elem-1)){
           int start = elem;
            int count = 0;

            while(set.contains(start)){
                count++;
                start++;
            }
              longest = Math.max(count , longest);
          }
         
       }
       return longest;
    }
}