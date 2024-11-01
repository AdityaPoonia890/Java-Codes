import java.util.*;
import javax.ser
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
public class DateDemo {
    public static void main(String[] args) {
        
    
    ZonedDateTime zd=ZonedDateTime.now();
 
    DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z");
    System.out.println(df.format(zd));
}
}