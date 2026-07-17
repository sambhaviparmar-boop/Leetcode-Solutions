class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {

            if (map.containsKey(pattern.charAt(i))) {

                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), words[i]);
            }

            if (map2.containsKey(words[i])) {
                if (!map2.get(words[i]).equals(pattern.charAt(i))) {
                    return false;
                }

            } else {
                map2.put(words[i], pattern.charAt(i));
            }

        }
        return true;
    }
}