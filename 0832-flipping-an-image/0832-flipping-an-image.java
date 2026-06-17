class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        

     for(int i =0; i<arr.length; i++){
        int j = 0;
        int k = arr[i].length-1;
     while(j<k){
        int temp = arr[i][j];
         arr[i][j] = arr[i][k];
        arr[i][k] = temp;
        j++;
        k--;
     }
       
     }
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            arr[i][j]=arr[i][j]==0?1:0;
        }
      }
      return arr;

    }
}