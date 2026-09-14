class Solution {
    public void combSum(int arr[], int i ,  ArrayList<Integer> combin,  List<List<Integer>> ans, int target){

        if(target == 0){
           ans.add(new ArrayList<>(combin));
            return ;
        }
        if( i == arr.length || target < 0){
            return ;
        }
     
        //single
        combin.add(arr[i]);

    
        //multiple
         combSum(arr, i, combin , ans , target-arr[i]);

         combin.remove(combin.size()-1);

         //exclude
          combSum(arr, i+1, combin , ans , target);

    }



    public List<List<Integer>> combinationSum(int[] arr, int target) {
        ArrayList<Integer> combin = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combSum(arr, 0, combin, ans , target);

        return ans;
    }
}