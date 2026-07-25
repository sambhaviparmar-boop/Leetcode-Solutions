class Solution {
    public boolean strongPasswordCheckerII(String password) {
      boolean hasLower = false;
      boolean hasUpper = false;
      boolean hasDigit = false;
      boolean hasSpecial = false;

     if(password.length()<8){
            return false;
        }

     for(int i=0; i<password.length(); i++){
         char ch = password.charAt(i);


        
         if(i <  password.length()-1){
            if(password.charAt(i) == password.charAt(i+1)) return false;
        }
       
 
        if(Character.isLowerCase(ch)) hasLower = true;
        if(Character.isUpperCase(ch)) hasUpper = true;
        if(Character.isDigit(ch)) hasDigit = true;
        if(!Character.isLetterOrDigit(ch)) hasSpecial = true;

      

      

     }
      return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}