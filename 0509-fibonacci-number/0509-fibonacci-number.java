class Solution {
    public int fib(int n) {

        int[] hoo = new int [n+1];
        
        if(n == 1 || n==0){
            return n;
        }

     
        hoo[1] = 1;

       for(int i = 2; i< hoo.length ; i++){

       hoo[i] = hoo[i-1] + hoo[i-2];
         
       }

 return hoo[n];
        
    }
}