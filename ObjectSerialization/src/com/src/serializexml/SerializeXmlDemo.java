/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.serializexml;

import java.util.ArrayList;
import java.util.List;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Manojit Nandi
 */
public class SerializeXmlDemo {

    public static void main(String[] args) {
        try {
            Student st1 = new Student();
            st1.setRollno(101);
            st1.setSname("Manojit");
            
            Student st2 = new Student();
            st2.setRollno(102);
            st2.setSname("Raghav");
            
            List<Student> s = new ArrayList<>();
            s.add(st1);
            s.add(st2);
            
            College c = new College();
            c.setStudents(s);
            
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
            x.writeObject(c);
            x.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeXmlDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
