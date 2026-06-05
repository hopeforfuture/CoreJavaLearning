/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.hashmapdemo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Manojit Nandi
 */
public class HashMapMethodDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        
        students.put(101, "Manojit");
        students.put(102, "Sameer");
        students.put(103, "Rahul");
        students.put(104, "Bhavna");
        students.put(105, "Parul");
        students.put(106, "Ranjan");
        
        System.out.println("Showing contents of map: ");
        showMap(students);
        
        students.putIfAbsent(101, "Gautam");
        
        System.out.println("Showing contents of map: ");
        showMap(students);
        
        students.replace(101, "Kaniska");
        
        System.out.println("Showing contents of map: ");
        showMap(students);
        
        students.replaceAll((id, name) -> name.toUpperCase());
        
        System.out.println("Showing contents of map: ");
        showMap(students);
        
        System.out.println("Showing contents of map using forEach: ");
        showMapUsingForeach(students);
    }
    
    public static void showMap(HashMap<Integer, String> students) 
    {
        for(Map.Entry<Integer, String> entry : students.entrySet()) 
        {
            System.out.println("Id: " + entry.getKey());
            System.out.println("Name: " + entry.getValue());
            System.out.println("--------------------------");
        }
        
        System.out.println("Total map size: " + students.size());
    }
    
    public static void showMapUsingForeach(HashMap<Integer, String> students) {
        students.forEach((id, name) -> {
            System.out.println("Id: " + id);
            System.out.println("Name: " + name);
            System.out.println("--------------------------");
        });
    }
}
