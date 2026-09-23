class Solution {
    public int[][] merge(int[][] intervals) {

        // List<List<Integer>> ans = new ArrayList<>();
        List<int[]> ans = new ArrayList<>();

         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];

        

        for(int i = 1 ; i < intervals.length ; i++){
            
            if(currEnd >= intervals[i][0]){
                currEnd = Math.max(currEnd , intervals[i][1]);
            }
            else{
               ans.add(new int[]{currStart, currEnd});
            
            currStart = intervals[i][0];
            currEnd = intervals[i][1];
            }
        }

      ans.add(new int[]{currStart, currEnd});

         return ans.toArray(new int[ans.size()][]);
    }
}