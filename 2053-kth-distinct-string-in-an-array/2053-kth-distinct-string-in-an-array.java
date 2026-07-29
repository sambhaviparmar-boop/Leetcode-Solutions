class Solution {
    public String kthDistinct(String[] arr, int k) {
       
      int distinct = 0;

        for(int i=0 ; i<arr.length ; i++){
             int count = 0;
            for(int j= 0 ; j<arr.length; j++){
               if(arr[i].equals(arr[j])){
                count++;
               }
            }

            if(count == 1){
              distinct++;

              if(distinct == k){
                return arr[i];
              }
            }
            
        }
        return "";
    }
}