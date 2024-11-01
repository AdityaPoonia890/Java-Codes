public class Pat2 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<2*n-1;i++){
            if(i<n){
            for( int j=0;j<=i;j++){
                System.out.print("*");
            }}
            else{
                for( int j=0;j<2*n-i-1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nStarTriangle(5);
    }
}

