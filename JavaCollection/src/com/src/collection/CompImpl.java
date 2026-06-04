/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.Comparator;

/**
 *
 * @author Manojit Nandi
 */
public class CompImpl implements Comparator<Integer> {
    
    @Override
    public int compare(Integer o1, Integer o2) {
        int r1 = o1%10;
        int r2 = o2%10;
        
        if(r1 > r2) {
            return 1;
        }
        return -1;
    }
}
