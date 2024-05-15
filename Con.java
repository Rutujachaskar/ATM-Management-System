package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;

    public Con() {
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/file1","root","Rutuja@123");
            statement= connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
