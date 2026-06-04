/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.property;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Manojit Nandi
 */
public class PropertySetInput {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        OutputStream ios = new FileOutputStream("dataConfig.properties");
        
        p.setProperty("url", "localhost:3306/myDB");
        p.setProperty("uname", "root");
        p.setProperty("pw", "password");
        
        p.store(ios, null);
    }
}
