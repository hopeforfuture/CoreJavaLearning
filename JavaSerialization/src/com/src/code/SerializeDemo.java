/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Manojit Nandi
 */
public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Save obj = new Save(10, 15);
        
        File f = new File("objectLog");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();
        
        System.out.println("Object after retrieving: " + obj1);
    }
}

class Save implements Serializable {
    private int i,j;
    
    public Save(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "Save{" + "i=" + i + ", j=" + j + '}';
    }
}
