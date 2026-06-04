/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Manojit Nandi
 */
public class TreeSetCollection {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();
        st.add(9);
        st.add(2);
        st.add(3);
        st.add(5);
        st.add(-1);
        
        System.out.println("--------List of integers in set---------");
        for(Integer i : st) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
    }
}
