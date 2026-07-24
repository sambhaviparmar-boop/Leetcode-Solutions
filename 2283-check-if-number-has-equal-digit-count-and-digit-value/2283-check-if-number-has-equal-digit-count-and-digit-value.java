class Solution {
    public boolean digitCount(String num) {
        int[] frequency = new int [10];

        for(int i=0 ; i<num.length() ; i++){
            int digit = num.charAt(i) - '0';
            frequency[digit]++;
        }

        for(int i=0 ; i<num.length() ; i++){
            int Expected = num.charAt(i) - '0';
           int Actual = frequency[i];

           if(Expected != Actual){
            return false;
           }
        }
        return true;
    }
}