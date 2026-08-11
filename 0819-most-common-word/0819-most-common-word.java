class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split(" ");

        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<words.length; i++){
            if(!bannedSet.contains(words[i]) && !words[i].isEmpty()){
                 map.put(words[i], map.getOrDefault(words[i], 0)+1);
            }
        }
          
           int maxFreq = 0;
           String maxS = "";

           for(String s : map.keySet()){
            if(maxFreq < map.get(s)){
                maxFreq = map.get(s);
                maxS = s;
            }
           }
           return maxS;
        }
}
