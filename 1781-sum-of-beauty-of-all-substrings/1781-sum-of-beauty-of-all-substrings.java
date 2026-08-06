class Solution {
    public int beautySum(String s) {
        int TotalBeauty = 0;
        int beauty = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
        HashMap<Character, Integer> map = new HashMap<>();

         for (int j = i; j < n; j++) {
            char ch = s.charAt(j);
             map.put(ch, map.getOrDefault(ch , 0)+1);

            int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
     
         for (int freq : map.values()) {
    maxFreq = Math.max(maxFreq, freq);
     minFreq = Math.min(minFreq, freq);
      }

         beauty = maxFreq - minFreq;
         TotalBeauty = TotalBeauty + beauty;
        }
        }
           
          return TotalBeauty;
    }
}