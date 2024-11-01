
    
import java.io.*;

class Producer extends Thread
{
    PipedOutputStream os;
    
    public Producer(PipedOutputStream o)
    {
        os=o;
    }
    
    public void run()
    {    int a=1;
        int count=1;
        
        while(a<100)
        {
            try{
            os.write(count);
            os.flush();
            
            System.out.println("Producer "+count);
            System.out.flush();

           
            count++;
            }catch(Exception e){}
            a++;
        }
    }
    
}

class Consumer extends Thread
{
    PipedInputStream is;
    
    public Consumer(PipedInputStream s)
    {
        is=s;
    }
    
    public void run()
    {int a=1;
        int x;
        
        while(a<100)
        {
            try{
            
                x=is.read();
            
            System.out.println("Consumer "+x);
            System.out.flush();
            

            }catch(Exception e){}
            a++;
        }
    }
    
}



public class PipedDemo 
{
    public static void main(String[] args) throws Exception
    {
       PipedInputStream pis=new PipedInputStream();
       PipedOutputStream pos=new PipedOutputStream();
       
       pos.connect(pis);
       
       Producer p=new Producer(pos);
       Consumer c=new Consumer(pis);
       
       p.start();
       
       c.start();
       
    }  
}
