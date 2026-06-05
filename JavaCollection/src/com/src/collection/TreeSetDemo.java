/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.TreeSet;

/**
 *
 * @author Manojit Nandi
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        ts.add(101);
        ts.add(91);
        ts.add(301);
        ts.add(77);
        ts.add(-101);
        
        for(int i : ts) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
