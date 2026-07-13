class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
       for(int i=0; i<jewels.length(); i++){
        for(int j=0; j<stones.length(); j++){
        char ch = jewels.charAt(i);
        char ch2 = stones.charAt(j);

        if(ch == ch2){
            count++;
        }

       } }
       return count;
    }
}