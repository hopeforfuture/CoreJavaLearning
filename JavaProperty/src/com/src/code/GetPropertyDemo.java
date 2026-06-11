/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Manojit Nandi
 */
public class GetPropertyDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("propertyData");
        InputStream is = new FileInputStream(f);
        Properties p = new Properties();
        
        p.load(is);
        System.out.println("url: " + p.getProperty("url"));
        System.out.println("uname: " + p.getProperty("uname"));
        System.out.println("pw: " + p.getProperty("pw"));
    }
}
