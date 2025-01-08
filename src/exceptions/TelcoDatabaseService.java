package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TelcoDatabaseService {
    public void getCustomerData(String customerId) throws SQLException {
        // Simulating a database connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/telco_db", "user", "password");
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM customers WHERE customer_id = '" + customerId + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                System.out.println("Customer Name: " + resultSet.getString("name"));
            } else {
                System.out.println("Customer not found for ID: " + customerId);
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            throw e; // Re-throw the exception
        } finally {
            if (connection != null) {
                connection.close(); // Ensure the connection is closed
            }
        }
    }

    public static void main(String[] args) {
        TelcoDatabaseService service = new TelcoDatabaseService();
        try {
            service.getCustomerData("C12345");
        } catch (SQLException e) {
            System.out.println("Error while fetching customer data: " + e.getMessage());
        }
    }
}
