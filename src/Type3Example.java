// Type 3 example for understanding purpose only
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Type3Example {
    public static void main(String[] args) {
        try {
            // Load network protocol driver (example: IDS Server)
            Class.forName("com.inet.tds.TdsDriver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:inetdae7://localhost:1433/myDb", "username", "password");

            if (connection != null) {
                System.out.println("Connected to the database using Type 3 driver!");
            }

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
