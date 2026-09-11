class Solution {
    public int maxArea(int[] height) {
        int LP = 0;
        int RP = height.length-1;
        int ans = 0;
         int h = 0;

        while(LP < RP){
            int width = RP - LP;
             h = Math.min(height[LP], height[RP]);

            int area = width * h;

            ans = Math.max(ans , area);

           if(height[LP] < height[RP]) {
    LP++;
}
else {
    RP--;
}
        }

      

        return ans;

    }
}