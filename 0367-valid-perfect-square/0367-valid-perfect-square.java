class Solution {
    public boolean isPerfectSquare(int num) {
        long s = 1;
        long e = num;

        while(s <= e){
            long mid = s + (e-s)/2;
            long sq = mid * mid ;

            if(sq == num){
                return true;
            }
            else if (sq < num){
               s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    }
}