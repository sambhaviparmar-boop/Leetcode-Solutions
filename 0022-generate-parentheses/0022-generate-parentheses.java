class Solution {
   void paranthesis(ArrayList<String> ans, StringBuilder temp, int l , int r ,  int n){

     if(l + r == 2 * n){
        ans.add(temp.toString());
        return;
     }

     if(l < n){
        temp.append("(");
        paranthesis(ans , temp , l+1 , r , n);

       temp.deleteCharAt(temp.length()-1);
     }

     if(r < l){
        temp.append(")");
        paranthesis(ans , temp , l , r+1, n);
         temp.deleteCharAt(temp.length()-1);
     }
    
   }




    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        paranthesis(ans , temp , 0 , 0 , n);

        return ans;
      
    }
}