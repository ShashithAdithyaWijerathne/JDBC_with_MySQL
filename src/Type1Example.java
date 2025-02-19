//Type 1 example for understanding purpose only (not commonly used now)
// 01 - Import the libraries into the class
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Type1Example {
    public static void main(String[] args) {
        try {
            // 02 - Load the MySQL JDBC Driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // 03 - Establish the connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:odbc:myDataSource", "username", "password");

            if (connection != null) {
                System.out.println("Connected to the database using Type 1 driver!");
            }

            // 04 - Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
