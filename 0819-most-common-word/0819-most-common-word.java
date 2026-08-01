class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split(" ");

        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String , Integer> map = new HashMap<>();

        for(int i=0; i<words.length; i++){
            map.put(words[i] , map.getOrDefault(words[i], 0)+1);
        }

        String maxWord = "";
        int maxFreq = 0;

        for(int i=0 ; i<words.length; i++){
         if (!bannedSet.contains(words[i]) && !words[i].isEmpty()) {

            if(map.get(words[i])>maxFreq){
               maxFreq = map.get(words[i]);
               maxWord = words[i];
            }
        }
       
        }
        return maxWord;
    }
}