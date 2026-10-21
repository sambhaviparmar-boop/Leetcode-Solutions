class Solution {
    public boolean isValid(String str) {

       Stack<Character> st = new Stack<>();

      for(int i=0 ; i<str.length() ; i++){
        char ch = str.charAt(i);

          //opening...
          if(ch == '(' || ch == '{' || ch == '['){
           st.push(ch);
          }

          //closing..
          else{
             if(st.size() == 0){
                return false;
             }

             if((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}')  || (st.peek() == '[' && ch == ']')){
                st.pop();
             }
             else{ //no match is found
               return false;
             }
          }

          
      } 
      return st.isEmpty(); 
    }
}