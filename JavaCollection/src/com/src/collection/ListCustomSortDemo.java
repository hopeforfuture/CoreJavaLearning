/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Manojit Nandi
 */
public class ListCustomSortDemo {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(107);
        lst.add(501);
        lst.add(534);
        lst.add(796);
        lst.add(435);
        lst.add(333);
        lst.add(298);
        lst.add(110);
        
        //Comparator<Integer> comp = new CompImpl();
        Comparator<Integer> comp = (o1, o2) -> {
            return o1%10 > o2%10 ? 1 : -1;
        };
        Collections.sort(lst, comp);
        
        for(int i : lst) {
            System.out.println(i);
        }
    }
}
