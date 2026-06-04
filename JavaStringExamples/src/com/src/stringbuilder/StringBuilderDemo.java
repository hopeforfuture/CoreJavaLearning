/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.stringbuilder;

/**
 *
 * @author Manojit Nandi
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //append method
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is a programming ");
        sb.append("language");
        System.out.println(sb);
        
        //insert method
        StringBuilder sb1 = new StringBuilder("Jva");
        sb1.insert(1, 'a');
        System.out.println("New string after inserting char at first position: " + sb1);
        
        //delete method
        StringBuilder sb2 = new StringBuilder("Java Programming");
        String sb2_copy = sb2.toString();
        sb2.delete(4, 16);
        System.out.printf("%s becomes %s after character deletion ", sb2_copy, sb2);
        System.out.println("");
        
        //deleteCharAt
        StringBuilder sb3 = new StringBuilder("Javva");
        String sb3_copy = sb3.toString();
        sb3.deleteCharAt(3);
        System.out.printf("%s becomes %s after char deletion", sb3_copy, sb3);
        System.out.println("");
        
        //replace method
        StringBuilder sb4 = new StringBuilder("Java");
        String sb4_copy = sb4.toString();
        sb4.replace(0, 4, "Python");
        System.out.printf("%s becomes %s after char replace", sb4_copy, sb4);
        System.out.println("");
        
        //reverse method
        StringBuilder sb5 = new StringBuilder("Java");
        String sb5_copy = sb5.toString();
        sb5.reverse();
        System.out.printf("%s becomes %s after reverse", sb5_copy, sb5);
        System.out.println("");
        
        //charAt method
        StringBuilder sb6 = new StringBuilder("Java");
        String sb6_copy = sb6.toString();
        char ch = sb6.charAt(3);
        System.out.printf("Character at 3rd position in the string %s : %c", sb6, ch);
        System.out.println("");
        sb6.setCharAt(0, 'K');
        System.out.printf("%s becomes %s after setting character at position 0", sb6_copy, sb6);
        System.out.println("");
        
        //Capacity growth
        StringBuilder sb7 = new StringBuilder("");
        System.out.println("Initial capacity: " + sb7.capacity());
        sb7.append("abcdefghijklmnopq");
        System.out.println("Final capacity: " + sb7.capacity());
    }
 
}
