class Solution {
    public boolean validMountainArray(int[] arr) {
     if(arr.length < 3){
        return false;
     }
       
      int i = 0;

      while(i < arr.length-1 && arr[i] < arr[i+1]){
          i++;
      }

     int j = arr.length-1;
     while(j > 0 && arr[j-1] > arr[j]){
        j--;
     }

    
     return i == j && i!=0 && i != arr.length-1;
    }
}