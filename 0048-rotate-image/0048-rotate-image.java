class Solution {
    public void rotate(int[][] arr) {
      for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            int temp = arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
      }
       for(int i=0; i<arr.length; i++){
       int left=0;
       int right = arr.length-1;
       while(left<right){
       
   
                int temp = arr[i][left];
                arr[i][left]= arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        

       }
    }
}