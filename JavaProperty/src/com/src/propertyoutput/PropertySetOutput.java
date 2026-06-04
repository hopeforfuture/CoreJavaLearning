package com.src.propertyoutput;

import java.util.Properties;
import java.io.FileInputStream;

public class PropertySetOutput {

    public static void main(String[] args) {

        Properties p = new Properties();

        try (FileInputStream fis = new FileInputStream("dataConfig.properties")) {

            p.load(fis);

            System.out.println("Url: " + p.getProperty("url"));
            System.out.println("Username: " + p.getProperty("uname"));
            System.out.println("Password: " + p.getProperty("pw"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}