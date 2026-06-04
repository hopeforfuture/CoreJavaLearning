/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Manojit Nandi
 */
public class FindDuplicatesDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("John");
        names.add("Smith");
        names.add("Dravid");
        names.add("John");
        names.add("Smith");
        names.add("Andy");
        names.add("Embape");
        
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        
        for(String name : names) {
            if(!seen.add(name)) {
                duplicates.add(name);
            }
        }
        
        System.out.println("Duplicate elements found: ");
        for(String name : duplicates) {
            System.out.print(name + " ");
        }
        System.out.println("");
     }
}
