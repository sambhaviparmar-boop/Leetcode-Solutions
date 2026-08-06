class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int window = n-k;
        int minSum = 0;
        int windowSum = 0;
        int oldSum = 0;
         int totalSum = 0;


        for (int num : cardPoints) {
            totalSum += num;
        }

        for(int i = 0; i<window; i++){
           windowSum = windowSum + cardPoints[i];
        }
        
         minSum = windowSum;

         for(int i = window; i<n; i++){
    windowSum = windowSum - cardPoints[i - window] + cardPoints[i];
    minSum = Math.min(minSum, windowSum);
         }
         return totalSum - minSum;
    }
}