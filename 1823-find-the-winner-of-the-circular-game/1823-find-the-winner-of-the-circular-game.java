class Solution {

   public int winner(boolean[] person , int n , int index , int person_left , int k){
       
       //base case
       if(person_left == 1){
        for(int i=0 ; i<n ; i++){
            if(!person[i]){
                return i;
            }
        }
       }


      //find position of kill
      int kill = (k-1) % person_left;

      while(kill > 0){
        index = (index + 1) % n;


        while(person[index]){
            index = (index + 1) % n;  //skip the killed person
        }

        
      kill--;

      }


      //kill that person
        person[index] = true;

        //find next alive person
            index = (index + 1) % n;  

//kill that
             while (person[index]) {
            index = (index + 1) % n;
        }
        

       return winner(person , n , index , person_left-1 , k);

      }




    public int findTheWinner(int n, int k) {
        
        boolean[] person = new boolean[n];

        return winner(person , n , 0 , n , k)+1;
    }
}