class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     ArrayList<Integer> ans = new ArrayList<>();

        int[] countP = new int[26];
        int[] countS = new int[26];

        if(s.length() < p.length()){
            return ans;
        }

        for(int i=0; i<p.length(); i++){
            countP[p.charAt(i) - 'a']++;
        }

        for(int i=0; i<s.length(); i++){
           countS[s.charAt(i) - 'a']++;


         if(i >= p.length()){
            countS[s.charAt(i - p.length()) - 'a']--;
         }


        if(Arrays.equals(countS, countP)){
            ans.add(i - p.length() + 1);
        }

        }

    return ans;

    }
}