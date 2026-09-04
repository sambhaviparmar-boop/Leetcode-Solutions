class Solution {
   void paranthesis(int n , int left , int right ,List<String> ans , StringBuilder temp){

    if(left + right == 2 * n){
        ans.add(temp.toString());
        return;
    }
    if(left < n){
        temp.append("(");
        paranthesis(n, left+1, right, ans, temp);
        temp.deleteCharAt(temp.length()-1);
    }
    if(right < left){
       temp.append(")");
       paranthesis(n, left, right+1, ans , temp);
       temp.deleteCharAt(temp.length()-1);
    }
   }




    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        paranthesis(n, 0 , 0, ans , temp);
        return ans;
    }
}