class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        String ans = "";
        for(String word: words){
            String reverse = "";
            for(int i= word.length()-1; i>=0; i--){
           reverse = reverse + word.charAt(i);
        }
        ans = ans + reverse + " ";
        }
         return ans.trim();
    }
}