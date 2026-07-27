class Solution {
    public int distributeCandies(int[] candyType) {
        int uniqueCandy = 0;
        int count = 0;
        int Total = candyType.length;
        for (int i = 0; i < candyType.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (candyType[i] == candyType[j]) {
                   found = true;
                   break;
                }
            }
            if(!found){
               uniqueCandy++; 
            }

        }
        int eat = Total / 2;

        int ans = Math.min(uniqueCandy, eat);
        return ans;
    }
}