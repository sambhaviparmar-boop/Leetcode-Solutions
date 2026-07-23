class Solution {
    public String greatestLetter(String s) {
       HashSet<Character> set = new  HashSet<>();
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
             set.add(ch); 
        }

        for(char ch = 'Z' ; ch>= 'A' ; ch--){
            if(set.contains(ch) && set.contains((char)(ch+32))){
                return String.valueOf(ch);
            }
        }
        return "";
    }
}