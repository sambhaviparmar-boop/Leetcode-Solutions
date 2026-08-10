class Solution {
    public int maxProfit(int[] arr) {
        int smallest = arr[0];
        int highest = 0;
        int result;

        for(int i=1; i<arr.length; i++){

            if(arr[i]<smallest){
                    smallest = arr[i];
             }
             result = arr[i] - smallest;

             if(result>highest){
                highest = result;
             }
        }
        return highest;
    }
}