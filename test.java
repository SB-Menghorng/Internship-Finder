
import java.io.*;
import java.sql.*;

public class test {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/test";//table detial
        String username = "root";// MySQL credential
        String password = "menghorng";
        String query = "select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println(
            "Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs
            = st.executeQuery(query); // Execute query
        rs.next();
        String name
            = rs.getString("name"); // Retrieve name from db
 
        System.out.println(name); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");

    }
}
