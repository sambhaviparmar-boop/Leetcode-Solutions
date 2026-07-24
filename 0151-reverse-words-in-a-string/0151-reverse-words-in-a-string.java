class Solution {
    public String reverseWords(String s) {
        String reverse = "";
       String[] arr =   s.trim().split("\\s+");
        for(int i=arr.length-1; i>=0; i--){
           
            reverse = reverse + arr[i] + " ";
              
        }
        return reverse.trim(); 
    }
}