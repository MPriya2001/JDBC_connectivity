import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";
        
        String sql = "INSERT INTO Employees (Name, Position, Salary) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, "John Doe");
            pstmt.setString(2, "Software Engineer");
            pstmt.setBigDecimal(3, new java.math.BigDecimal("75000.00"));
            
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
