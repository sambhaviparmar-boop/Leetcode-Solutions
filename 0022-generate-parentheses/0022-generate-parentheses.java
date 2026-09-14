class Solution {
   void paranthesis(int n , int l , int r, ArrayList<String> ans, StringBuilder temp){

      if(l + r == 2 * n){
        ans.add(temp.toString());
        return;
      }

      if(l < n){
       temp.append("(");
        paranthesis(n , l+1,r,  ans, temp);
        temp.deleteCharAt(temp.length()-1);
      }
      if(r < l){
        temp.append(")");
        paranthesis(n, l ,r+1, ans , temp);
        temp.deleteCharAt(temp.length()-1);
      }
   }




    public List<String> generateParenthesis(int n) {
       ArrayList<String> ans = new ArrayList<>();
       StringBuilder temp = new StringBuilder();

       paranthesis(n , 0, 0, ans , temp);

       return ans;
    }
}