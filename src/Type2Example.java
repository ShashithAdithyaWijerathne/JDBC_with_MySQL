// This is a conceptual example as Type 2 drivers are specific to database vendors
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Type2Example {
    public static void main(String[] args) {
        try {
            // 02 - Load the MySQL JDBC Driver
            Class.forName("com.ibm.db2.jcc.DB2Driver");

            // 03 - Establish the connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:db2://localhost:50000/myDb", "username", "password");

            if (connection != null) {
                System.out.println("Connected to the database using Type 2 driver!");
            }

            // 04 - Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
