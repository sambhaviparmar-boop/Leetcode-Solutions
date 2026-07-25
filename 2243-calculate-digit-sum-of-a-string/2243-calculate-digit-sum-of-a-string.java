class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            String newString = "";


            for (int i = 0; i < s.length(); i += k) {
                int end = Math.min(i + k, s.length());
                String part = s.substring(i, end);

               int sum = 0;
                for (int j = 0; j < part.length(); j++) {
                    sum += part.charAt(j) - '0';
                }

                newString += sum;
            }
            s = newString;
        }
        return s;
    }
}