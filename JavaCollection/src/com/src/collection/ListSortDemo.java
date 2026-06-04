/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Manojit Nandi
 */
public class ListSortDemo {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(101);
        lst.add(301);
        lst.add(91);
        lst.add(71);
        lst.add(651);
        lst.add(-109);
        lst.add(1011);
        
        Collections.sort(lst);
        Collections.reverse(lst);
        
        for(int i : lst) {
            System.out.println(i);
        }
    }
}
