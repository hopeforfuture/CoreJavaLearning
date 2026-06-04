/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.Vector;

/**
 *
 * @author Manojit Nandi
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(101);
        v.add(102);
        v.add(103);
        v.add(104);
        v.add(105);
        
        for(int i : v) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
