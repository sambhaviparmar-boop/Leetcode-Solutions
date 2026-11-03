class Solution {

     boolean isSafe(List<String> board, int row , int col , int n){

      //horizontally
      for(int j=0; j<n ; j++){
         if(board.get(row).charAt(j) == 'Q'){
            return false;
         }
      }


      //vertically
      for(int i=0 ; i<n ; i++){
        if(board.get(i).charAt(col) == 'Q'){
            return false;
        }
      }


      //diagonally

      //for left diagonal
      for(int i= row , j= col ; i>=0 && j>= 0 ; i-- ,j--){

       if(board.get(i).charAt(j) == 'Q'){
        return false;
       }



      }


      //for right diagonal

      for(int i= row , j= col ; i>= 0 && j<n ; i-- , j++){
         if(board.get(i).charAt(j) == 'Q'){
            return false;
         }
      }




       return true;



     }





     void nQueens(List<String> board, int row , int n, List<List<String>>ans){
        //Base case
        if(row == n){
           ans.add(new ArrayList<>(board));
            return;
        }


        //possible coloumns m check
        for(int j=0 ; j<n ; j++){
            if(isSafe(board , row , j , n)){

                //place a queen
                StringBuilder sb = new StringBuilder(board.get(row));
                 sb.setCharAt(j, 'Q');
               
                board.set(row, sb.toString());


                nQueens(board , row+1 , n, ans);

                 //backtrack
                   sb.setCharAt(j, '.');
                  board.set(row, sb.toString());
            }
        }
     }



    public List<List<String>> solveNQueens(int n) {

        // List<String> board = new ArrayList<>(n , String(n , '.'));
        List<String> board = new ArrayList<>();
      for (int i = 0; i < n; i++) {
      board.add(".".repeat(n));
       }


        List<List<String>>ans = new ArrayList<>();

        nQueens(board , 0 , n , ans);

        return ans;

    }
}