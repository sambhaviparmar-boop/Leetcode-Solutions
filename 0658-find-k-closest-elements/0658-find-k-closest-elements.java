class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int s = 0;
        int e = arr.length-k;
      

        while(s < e){
            int mid = (s+e)/2;

            // int leftDistance = Math.abs(arr[mid]-x);
            // int RightDistance = Math.abs(arr[mid+k]-x);

            if(x-arr[mid] > arr[mid+k]-x){
                 s = mid+1;
            }
            else{
                e = mid;
            }
        }

          List<Integer> ans = new ArrayList<>();

        for (int i = s; i < s + k; i++) {
            ans.add(arr[i]);
        }
         
        return ans;
    }
}