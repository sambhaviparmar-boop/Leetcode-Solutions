class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

       
        int total =  nums.length/3;
        for(int i=0; i< nums.length; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int num: map.keySet()){
        if(total < map.get(num)){
             result.add(num);
           }
        }
      return result;
    }
}