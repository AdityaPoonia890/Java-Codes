public class Pat6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n-1;i++){
            if(i<((2*n-1)/2)+1){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                for(int sp=0;sp<(2*n)-(2*i)-2;sp++){
                    System.out.print("  ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<2*n-i-1;j++){
                    System.out.print("* ");
                }
                for(int sp=0;sp<(2*i+2)-2*n;sp++){
                    System.out.print("  ");
                }
                for(int j=0;j<2*n-i-1;j++){
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
    
}
