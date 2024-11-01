
    
    public class DataHidingAndArrayofObjectTest
   {
    public static void main(String[] args) 
        {
            DataHidingAndArrayofObject subs[]=new DataHidingAndArrayofObject[3];
            subs[0]=new DataHidingAndArrayofObject("s101","DS",100);
            subs[1]=new DataHidingAndArrayofObject("s102","Algorithms",100);
            subs[2]=new DataHidingAndArrayofObject("s103","Operating Systems",100);
            
            for(DataHidingAndArrayofObject s:subs)
                System.out.println(s);
                
        }
        
    }

    

