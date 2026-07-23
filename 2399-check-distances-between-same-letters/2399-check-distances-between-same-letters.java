class Solution {
    public boolean checkDistances(String s, int[] arr) {
      
      for(int i=0 ; i<arr.length ; i++){
        char ch = (char)(i+97);

        if(s.indexOf(ch) != -1){
            int count = s.lastIndexOf(ch)-s.indexOf(ch)-1 ;
            if(arr[i] != count) return false;
        }
       

      

      }
      return true;
    }
}