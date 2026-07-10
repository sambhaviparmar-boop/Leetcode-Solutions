class Solution {
    public boolean isHappy(int n) {
     ArrayList<Integer> list = new ArrayList<>();
       if(n == 1) return true;
        while(n != 0){
            int sum = 0;
            while(n>0){
                int digit = n % 10;
                 n/=10;
                 sum += digit * digit;
            }
            if(sum == 1) return true;
            else if(list.contains(sum)) return false;
            n =sum;
            list.add(sum);
        }
        return false;
    }
}