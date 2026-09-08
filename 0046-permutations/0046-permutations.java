class Solution {
     public void main(int nums[],List<List<Integer>> ans, ArrayList<Integer> temp,  boolean[] visited){


        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }


        for(int i=0; i<nums.length; i++){
            if(!visited[i]){

                visited[i] = true;
                temp.add(nums[i]);
            
            main(nums, ans, temp, visited);
           
            temp.remove(temp.size()-1);
             visited[i] = false;
            }
        }
     } 



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
         boolean[] visited = new boolean[nums.length];

     main(nums, ans , temp , visited);
     return ans;
    }
}