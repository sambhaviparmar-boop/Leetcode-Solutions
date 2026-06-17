class Solution {
    public int[][] transpose(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];

        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ; j++){
                transpose[j][i] = arr[i][j];

            }

        }
        return transpose;
    
    }
}