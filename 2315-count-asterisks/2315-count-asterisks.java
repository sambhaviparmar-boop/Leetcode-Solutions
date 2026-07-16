class Solution {
    public int countAsterisks(String s) {
        int cb = 0;
        int a =0;
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) == '|'){
                cb++;
            }
            else if(s.charAt(i) == '*'){
                if(cb % 2 == 0){
                    a++;
                }
            }
        }
        return a;
    }
}