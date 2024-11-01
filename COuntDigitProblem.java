class Test1{
    static int count(int n){
        int solution=0;
        int t=n;
        int c=(int)Math.log10(n)+1;
        while(c>0){
            int q=t/((int)Math.pow(10,c-1));
            if(q!=0){
              if(n%q==0){
                solution+=1;
              }
            }
             t=t%((int)Math.pow(10,c-1));
             c--;
        }
        return solution;
}}
public class COuntDigitProblem {
    public static void main(String[] args) {
        System.out.println(Test1.count(660));
    }
}
