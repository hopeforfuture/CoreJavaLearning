/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Manojit Nandi
 */
public class HashMapPrimitiveType {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Navin");
        map.put(102, "Sameer");
        map.put(103, "Kavya");
        map.put(104, "Niyati");
        map.put(105, "Raghav");
        map.put(106, "Raju");
        
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " --------> " + entry.getValue());
            System.out.println("");
        }
        
        System.out.println("--------Iterating using keySet------------");
        showUsers(map);
        
        int sKey = 102;
        String sName = "Kavya";
        System.out.println("Value at key " + sKey + " : " + map.get(sKey));
        
        map.remove(sKey);
        System.out.println("--------List of users after record deletion---------");
        showUsers(map);
        
        System.out.println("Value exists at key " + sKey + " : " +  map.containsKey(sKey));
        System.out.println("Value exists " + sName + " : " +  map.containsValue(sName));
        System.out.println("Map size: " + map.size());
    }
    
    public static void showUsers(HashMap<Integer, String> map) {
        for(Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " ------------> " + value);
        }
    }
}
