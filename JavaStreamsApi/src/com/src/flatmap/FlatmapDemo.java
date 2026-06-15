/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.flatmap;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class FlatmapDemo {
    public static void main(String[] args) {
        List<List<Integer>> nested = Arrays.asList(
             Arrays.asList(1,2),
             Arrays.asList(3,4,5)
        );
        
        //List<Integer> flat = nested.stream().flatMap(Collection::stream).collect(Collectors.toList());
        List<Integer> flat = nested.stream().flatMap(collection -> collection.stream()).collect(Collectors.toList());
        for(int i : flat) {
            System.out.println(i);
        }
    }
}
