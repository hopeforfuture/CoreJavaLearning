/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author Manojit Nandi
 */
public class SetPropertyDemo {
    public static void main(String[] args) throws Exception {
        
        File f = new File("propertyData");
        OutputStream os = new FileOutputStream(f);
        
        Properties p = new Properties();
        p.setProperty("url", "localhost:3306/myDb");
        p.setProperty("uname", "root");
        p.setProperty("pw", "oracle");
        
        p.store(os, null);
    }
}
