class Solution {
    public boolean checkIfPangram(String arr) {
      HashSet<Character> set = new HashSet<>();

      for(int i=0 ; i<arr.length() ; i++){
           set.add(arr.charAt(i));

           
      } 
      if(set.size() == 26){
         return true;
      } 
      return false;
    }
}