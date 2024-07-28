// 01 - Import the libraries into the class
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Type1Example {
    public static void main(String[] args) {
        try {
            // 02 - Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver"); //sun.jdbc.odbc.JdbcOdbcDriver

            // 03 - Establish the connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/emp", "root", "SAdhi@#123");

            if (connection != null) {
                System.out.println("Connected to the database using MySQL JDBC driver!");
            }

            // 04 - Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
