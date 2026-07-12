class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans += Character.toLowerCase(ch);
            } 

        }
        int left = 0;
        int right = ans.length() - 1;
        while(left<right){
            if (ans.charAt(left) != ans.charAt(right)) {
                return false;

            }

            left++;
            right--;
        }
        return true;
    }
}