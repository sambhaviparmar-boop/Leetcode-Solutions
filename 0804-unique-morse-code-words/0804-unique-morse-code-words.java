class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();

        for(String word: words){
            // StringBuilder sb = new StringBuilder();

            String temp = "";

            for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

           temp = temp + (morse[ch-'a']);
           
        }
         set.add(temp);
        }
       return  set.size();
    }
}

