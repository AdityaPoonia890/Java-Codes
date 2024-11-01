public class SumDivisors {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sqrt=(int) Math.sqrt(n);
        int sum=0;
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
              sum+=i;
              if(i!=n/i){
                  sum+=n/i;
              }
            }
        }
        return sum;
    }
    public static int sumOfDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=sumOfAllDivisors(i);
        }
        return sum;
        
    }
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(3));
    }
}
