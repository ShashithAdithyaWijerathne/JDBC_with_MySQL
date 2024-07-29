import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Type4Example {
    public static void main(String[] args) {
        try {
            // Establish connection using Type 4 driver (MySQL)
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/myDb", "username", "password");

            if (connection != null) {
                System.out.println("Connected to the database using Type 4 driver!");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
