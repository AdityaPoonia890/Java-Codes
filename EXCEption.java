class NegativeDimensionException extends Exception{
    public  String toString(){
        return "can't be negative";
    }
}
 



class EXCEption{
    static int area(int l,int b)throws NegativeDimensionException
    {   if(l<0 || b<0)
        {
        throw new NegativeDimensionException();
         }
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        int AR=area(10,-2);
        System.out.println(AR);
        
    }
    public static void main(String[] args) {
       try{
        meth1();
       }
       catch(NegativeDimensionException e){
        
        System.out.println(e);
       }
    }

}