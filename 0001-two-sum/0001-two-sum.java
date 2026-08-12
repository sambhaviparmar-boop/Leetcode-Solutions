class Solution {
    public int[] twoSum(int[] arr, int target) {
       int n = arr.length;
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<n; i++){
        int first = arr[i];
        int second = target-first;

        if(map.containsKey(second)){
            return new int[]{map.get(second), i};
        }
        map.put(arr[i], i);
       }
       return new int[]{};
    }
}