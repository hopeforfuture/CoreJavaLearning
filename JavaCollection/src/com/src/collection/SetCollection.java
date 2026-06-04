/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Manojit Nandi
 */
public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(4);
        
        System.out.println("--------List of integers in set---------");
        for(Integer i : st) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
    }
}
