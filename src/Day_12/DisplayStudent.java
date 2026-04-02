package Day_12;
import java.sql.*;

public class DisplayStudent {
    public static void main(String args[]) {

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "password");

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Display records
            while(rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age")
                );
            }

            // Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}