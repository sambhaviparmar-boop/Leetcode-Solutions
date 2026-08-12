class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {  
      HashSet<Integer> s = new HashSet<>();
       int a=-1;
       int b;
       int expSum = 0;
       int actualSum = 0;
       int n = grid.length;

      for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid.length; j++){

            actualSum += grid[i][j];

          if(s.contains(grid[i][j])){
            a = grid[i][j];
            
          }
          s.add(grid[i][j]);
        }
      }
      expSum = n*n * (n*n +1) / 2;

      b = expSum + a - actualSum;

      return new int[]{a,b};
    }
}