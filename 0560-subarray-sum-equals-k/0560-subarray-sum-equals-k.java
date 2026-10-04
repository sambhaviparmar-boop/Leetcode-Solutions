class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> temp = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {

            prefixSum += nums[j];

            if (prefixSum == k) {
                count++;
            }

            int val = prefixSum - k;

            if (temp.containsKey(val)) {
                count += temp.get(val);
            }

            temp.put(prefixSum, temp.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}