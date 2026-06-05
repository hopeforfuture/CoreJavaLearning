/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Manojit Nandi
 */
public class TimeElapsedDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<1000000; i++) {
            lst.add(i);
        }
        long end = System.currentTimeMillis();
        long time_elapsed = end - start;
        System.out.println("Time elapsed: " + time_elapsed);
    }
}
