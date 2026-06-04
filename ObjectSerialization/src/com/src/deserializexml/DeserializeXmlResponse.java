/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.deserializexml;
import com.src.serializexml.SerializeXmlDemo;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
import java.util.logging.Level;
import com.src.serializexml.College;
import com.src.serializexml.Student;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class DeserializeXmlResponse {
    public static void main(String[] args) {
        try {
          XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
          College c = (College)x.readObject();
          x.close();
          List<Student> students = c.getStudents();
          for(Student s : students) {
              System.out.println("Name: " + s.getSname() + " Rollno: " + s.getRollno()); 
          }
        } catch(FileNotFoundException ex) {
            Logger.getLogger(SerializeXmlDemo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
