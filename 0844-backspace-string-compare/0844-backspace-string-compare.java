class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
         Stack<Character> s2 = new Stack<>();

         for(int i=0 ; i<s.length(); i++){
             if(s.charAt(i)=='#'){
                 if(!s1.isEmpty()) {
             s1.pop();
            }
             }
             else{
                s1.push(s.charAt(i));
             }
         }

          for(int j=0 ; j<t.length(); j++){
             if(t.charAt(j)=='#'){
                  if(!s2.isEmpty()) {
             s2.pop();
           }
             }
             else{
                s2.push(t.charAt(j));
             }
         }

         if(s1.size() != s2.size()){
            return false;
         }

         StringBuilder sb1 = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();

         while(!s1.isEmpty()){
             sb1.append(s1.pop());
         }

         while(!s2.isEmpty()){
            sb2.append(s2.pop());
         }

      return sb1.toString().equals(sb2.toString()) ? true : false;

    }
}