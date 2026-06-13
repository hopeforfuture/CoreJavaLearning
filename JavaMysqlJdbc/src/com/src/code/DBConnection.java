package com.src.code;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class DBConnection {

    public static void main(String[] args) {

        File f = new File("dataConfig.properties");
        Properties p = new Properties();

        try (
            InputStream is = new FileInputStream(f)
        ) {

            // Load properties file
            p.load(is);

            String url = p.getProperty("url");
            String username = p.getProperty("uname");
            String password = p.getProperty("pw");
            String sql = "SELECT * from students";

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            try (Connection con =
                    DriverManager.getConnection(url, username, password)) {
                
                Statement st = con.createStatement();
                ResultSet rs =  st.executeQuery(sql);
                
                while(rs.next()) {
                    String name = rs.getString("name");
                    String studentId = rs.getString("student_id");
                    String address = rs.getString("address_1") + " " + rs.getString("address_2");
                    
                    System.out.println("StudentId: " + studentId + " name: " + name + " Address: " + address);
                }

                System.out.println("Record reading successful.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}