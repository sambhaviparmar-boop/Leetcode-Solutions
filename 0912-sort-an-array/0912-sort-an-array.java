class Solution {
     void divide(int[] arr,int s  ,int e){
        
       if( s >= e) return;

       int m = s+(e-s)/2;

       divide(arr, s, m);
       divide(arr, m+1, e); 
       conquer(arr, s, m , e);    
    }

   void conquer(int[] arr, int s ,int m, int e){
       int[] merge = new int[e-s+1];
       int i =s; int j = m+1 ; int k = 0;

       while(i <= m && j <= e){
          if(arr[i] <= arr[j]){
            merge[k] = arr[i];
            i++;
            k++;
          }
          else{
            merge[k] = arr[j];
            k++;
            j++;
          }
       }

       while(i <= m){
        merge[k] = arr[i];
        i++;
        k++;
       }

       while(j <= e){
       merge[k] = arr[j];
       j++;
       k++;
       }

       for(int l=0; l<merge.length; l++){
        arr[l+s] = merge[l];
       }
        
   } 


 public  int[] sortArray(int[] arr){
        divide(arr, 0, arr.length-1);
    return arr;
    }
}