class StackException extends Exception{
    public String toString(){
        return "top is incorrect";
    }
}
class PushStack{
    static int[] push(int[]a,int top,int i,int size)throws StackException
    {
        if(top==size-1)
        throw new StackException();
        a[top]=i;
        return a;
    }

}
class PopStack{
    static int pop(int[]a,int top)throws StackException
    {
        if (top==-1)
        throw new StackException();
        return a[top];
    }
}
public class StackwithException {
    
    
    public static void main(String[] args) {
        
    PushStack push=new PushStack();
    int[] a=new int[5];
    int size=5;
    int top=-1;
    try{
    for (int i=0;i<a.length-1;i++){
       int[]p=PushStack.push(a,top,i+10,size);
       a=p;
        top++;

    }
   }
   catch (StackException e){
    System.out.println(e);
    for(int x:a){
        System.out.println(x);
    }

   }

 }

}
