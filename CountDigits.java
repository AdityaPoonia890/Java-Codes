class test{
    static int count(int n){
        int c=(int) Math.log10(n)+1;
        return c;
    }
}
public class CountDigits {
    public static void main(String[] args) {
        int n=336;
        System.out.println("N:"+n);
        System.out.println("digits = "+ test.count(n));
    }
}
