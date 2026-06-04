/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.serialized;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Manojit Nandi
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Manojit Nandi";
        try {
            File f1 = new File("obj.txt");
            FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e1);
            
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e1_1 = (Employee)ois.readObject();
            System.out.println("id: " + e1_1.id);
            System.out.println("name: " + e1_1.name);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        
    }
}

class Employee implements Serializable
{
    int id;
    String name;
}
