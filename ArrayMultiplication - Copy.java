public class ArrayMultiplication {
    public static void main(String[] args) {
        int a[][]={{2,3,4},{3,4,5},{5,6,7}};
        int b[][]={{9,8,7},{5,8,9},{4,9,7}};
        int k,l=0;
        int c[][]=new int[3][3];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
            for(k=0;k<a[i].length;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
            }      
        }
        for(int x[]:c){
            for(int z:x){
                System.out.println(z);
            }
        }
    }
    
}
