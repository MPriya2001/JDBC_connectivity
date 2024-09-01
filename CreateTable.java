import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            String sql = "CREATE TABLE Employees (" +
                         "ID INT PRIMARY KEY AUTO_INCREMENT, " +
                         "Name VARCHAR(100), " +
                         "Position VARCHAR(100), " +
                         "Salary DECIMAL(10, 2))";
            
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
