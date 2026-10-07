class Solution {
    public int sumFourDivisors(int[] nums) {

        int ans = 0;

    for(int num : nums){
      int count = 0;
      int curr = 0;
     
     for (int i = 1; i * i <= num; i++) {


      if(num % i == 0){
        int d1 = i;
        int d2 = num/i;

        if(d1 == d2){
            count++;
            curr += d1;
        } 
        else{
            count+=2;
            curr += d1+d2;
        }
         }              
    }
             if(count == 4){
                ans += curr;
             
              
            }
        }   
        return ans;
    }
}