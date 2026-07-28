class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        
         char ch = 'a';
        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);
            if (c == ' ')
                continue;

           if(!map.containsKey(c)){
              map.put(c, ch);
              ch++;
           }

        }

        for(int i=0; i<message.length(); i++){
            char c = message.charAt(i);

            if(c ==' '){
            ans.append(" ");
            continue;
        }

            ans.append(map.get(c));
        }
        return ans.toString();
    }
}