import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class AddingData {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
            String user = "root";
            String password = "secret";
            try {
                Connection conn = DriverManager.getConnection(url,user,password);
                Statement mystmt = conn.createStatement();
                mystmt.executeUpdate("insert into Contacts" + "(name,phone)" + "values('fred','1234567')");
                System.out.println("all good");
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }


