import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
