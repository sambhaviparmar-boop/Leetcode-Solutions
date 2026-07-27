class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        
        if(index == -1){
            return word;
        }


        String rev = "";

        for(int i=index ; i>=0; i--){
            rev = rev + word.charAt(i);
         
           
        }
        rev += word.substring(index+1);
        return rev;
    }
}