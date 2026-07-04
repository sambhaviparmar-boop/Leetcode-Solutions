class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] freq = new int[26];

        // Step 3: Count characters
        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            freq[ch1 - 'a']++;   // Increase count for s
            freq[ch2 - 'a']--;   // Decrease count for t
        }

        // Step 4: Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}