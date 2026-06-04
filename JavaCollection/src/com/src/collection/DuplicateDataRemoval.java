/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 * @author Manojit Nandi
 */
public class DuplicateDataRemoval {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("John");
        names.add("David");
        names.add("Smith");
        names.add("Goldy");
        names.add("Chris");
        names.add("Smith");
        names.add("John");
        
        System.out.println("Initial list becomes:");
        
        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("");
        System.out.println("-----------------------------------------");
        LinkedHashSet<String> allNames = new LinkedHashSet<>(names);
        
        names.clear();
        names.addAll(allNames);
        
        System.out.println("After deleting duplicate elements lists becomes:");
        
        for(String name : names) {
            System.out.print(name + " ");
        }
        
        System.out.println("");
    }
}
