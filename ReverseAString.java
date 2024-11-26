class ReveseAString {
    public  static boolean isPalindrome(String s) {
        int i =0;
        int j=s.length()-1;
        

        while (i < s.length()){

        /*  if(!isAlphanumeric(s.charAt(i)) ){
                i++;
            }*/

            if (!Character.isLetterOrDigit(s.charAt(i))) {
                    ++i;}
        /*  else if(!isAlphanumeric(s.charAt(j))){
                j--;
            }*/
           else if (!Character.isLetterOrDigit(s.charAt(j))) {
                    --j;}
            
            else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
                
            }
            
          ++i;
          --j;
        
    }
        return true;  
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM"));
    }
}
