class Solution {
    public int largestRectangleArea(int[] heights) {
      int n = heights.length;
    int[] left = new int[n]; //left smaller nearest
    int[] right = new int[n];   ///right smaller nearest
     Stack<Integer> s = new Stack<>();

     //right
     for(int i=n-1 ; i>=0 ; i--){
      
      while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
         s.pop();
      }

      right[i] = s.isEmpty() ? n : s.peek();
        
        s.push(i);
     }

     s.clear();


    //left
    
     for(int i = 0 ; i < n ; i++){
      
      while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
         s.pop();
      }

      left[i] = s.isEmpty() ? -1 : s.peek();
        
        s.push(i);
     }

     //final
     int ans = 0;
    
     for(int i=0 ; i<n ; i++){
      int currArea = heights[i] * (right[i] - left[i] - 1);

       ans = Math.max(currArea , ans);
     }

      return ans;
    }
}