class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 0; i < num.length() - 2; i++) {
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(i + 1);
            char ch3 = num.charAt(i + 2);

            if (ch1 == ch2 && ch1 == ch3) {
                String curr = "" + ch1 + ch2 + ch3;

                 if (curr.compareTo(ans) > 0) {
                ans = curr;
            }
            }
           
            
        }

       return ans;
    }
}