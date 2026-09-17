class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
//cyclic sort
        while(i < n){
           int curr = arr[i]-1;
           if(arr[i] > 0 && arr[i] < n && arr[i] != arr[curr]){
               int temp = arr[i];
               arr[i] = arr[curr];
               arr[curr] = temp;
           } 
           else{
            i++;
           }
        }
        //check
        for(int j=0; j<n ; j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
         return arr.length+1;
    }
}