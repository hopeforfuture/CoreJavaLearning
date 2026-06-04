/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Manojit Nandi
 */
public class ListCollection {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        
        System.out.println("---------List of elements in collection---------");
        for(Integer i : lst) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("--------Showing values using iterator--------");
        
        Iterator itr = lst.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
    }
}
