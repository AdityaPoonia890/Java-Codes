class Solution {
    public static int reverse(int x) {
         int rev=0;
         int c=0;
         long X=0;
        if(x>0 && x<Math.pow(2,31)){
           
            while(x>0){
                int ld=x%10;
                if((X*10+ld)>=Math.pow(2,31)){
                    System.out.println(c);
                    return 0;
                }
                rev=rev*10+ld;
                X=rev;
                x=x/10;
            }
        }
        else if(x>=Math.pow(-2,31) && x<0){
             while(x<0){
                int ld=x%10;
                rev=rev*10+ld;
                x=x/10;
            }
        }
        else{
            return 0;
        }
        return rev;
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(Solution.reverse(1534236469));
    }
}
