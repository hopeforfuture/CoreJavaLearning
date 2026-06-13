/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

import java.sql.*;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class EmployeeCrudDemo {

    public static void main(String[] args) {
        File f = new File("dataConfig.properties");
        Properties p = new Properties();
        Scanner sc = new Scanner(System.in);

        try (InputStream is = new FileInputStream(f)) {
            p.load(is);
            String url = p.getProperty("url");
            String username = p.getProperty("uname");
            String password = p.getProperty("pw");
            
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection con
                    = DriverManager.getConnection(url, username, password)) {

                while (true) {
                    System.out.println("\n===== MENU =====");
                    System.out.println("1. Insert");
                    System.out.println("2. View");
                    System.out.println("3. Update");
                    System.out.println("4. Delete");
                    System.out.println("5. Exit");
                    System.out.print("Choose: ");

                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            insertEmployee(con, sc);
                            break;

                        case 2:
                            displayEmployees(con);
                            break;

                        case 3:
                            updateEmployee(con, sc);
                            break;

                        case 4:
                            deleteEmployee(con, sc);
                            break;

                        case 5:
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Please give correct choice");
                    }

                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void insertEmployee(Connection con, Scanner sc) throws SQLException {

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name is required.");
            return;
        }

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (salary <= 0) {
            System.out.println("Salary must be greater than 0.");
            return;
        }

        String sql = "INSERT INTO employee(name, salary) VALUES(?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setDouble(2, salary);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record(s) inserted.");
        }
    }

    //Read
    static void displayEmployees(Connection con) {
        String sql = "SELECT * FROM employee";
        try (Statement st = con.createStatement()) {
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\nID\tName\tSalary");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getDouble("salary"));
            }
        } catch (Exception ex) {
            System.out.println("Exception occured: " + ex.toString());
        }
    }

    //Update
    static void updateEmployee(Connection con, Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();

        if (name.trim().length() == 0) {
            System.out.println("Name required.");
            return;
        }

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (salary <= 0) {
            System.out.println("Salary required.");
            return;
        }

        String sql = "UPDATE employee SET salary=?, name=? WHERE id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, salary);
            ps.setString(2, name);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record updated");
        } catch (Exception ex) {
            System.out.println("Exception occured: " + ex.toString());
        }
    }

    //Delete
    static void deleteEmployee(Connection con, Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM employee WHERE id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record deleted");
        } catch (Exception ex) {
            System.out.println("Exception occured: " + ex.toString());
        }

    }

}
