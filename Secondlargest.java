public class Secondlargest {
    public static void main(String[] args) {
        
       int A[]={5,6,11,4,90,69,55,78,82,100};
        for(int x:A){
            System.out.println(x);
        }
        int max1,max2;
        max1=A[0];
        max2=A[0];
        for (int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }


        }
        System.out.println("highest:"+max1);
        System.out.println("second highest:"+max2);
    }
    
}
