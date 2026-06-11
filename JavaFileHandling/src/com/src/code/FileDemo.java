/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Manojit Nandi
 */
public class FileDemo {
    public static void main(String[] args) throws Exception {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam efficitur sem sed finibus molestie. "
                + "Duis consequat condimentum lorem. Aliquam sem metus, rutrum eget felis vitae, tincidunt eleifend mauris. "
                + "Sed facilisis tortor sed odio aliquam feugiat. Donec feugiat lobortis dolor, vel placerat leo.";
        File f = new File("dataContent.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(str);
        
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String content = dis.readUTF();
        
        System.out.println("Reading from content: " + content);
    }
}
