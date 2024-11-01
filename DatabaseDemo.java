import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseDemo {
    public static void main(String[] args) {
        try{
        String str="select * from adi";
        String sql="create DATABASE db";
        String url="jdbc:mysql://localhost:3306";
        String dname="adidb";
        String pass="Codet@890";
        String user="root";
        Connection con=DriverManager.getConnection(url, user, pass);
        Statement st=con.createStatement();
        st.executeUpdate(sql);
        

    }
    catch(Exception e){};

    
}}
