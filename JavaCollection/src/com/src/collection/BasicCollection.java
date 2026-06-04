/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Manojit Nandi
 */
public class BasicCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        
        for(Integer i : c) {
            System.out.println(i);
        }
    }
}
