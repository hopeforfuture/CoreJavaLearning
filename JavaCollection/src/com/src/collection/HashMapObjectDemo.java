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
public class HashMapObjectDemo {
    public static void main(String[] args) {
       HashMap<Integer, User> map = new HashMap<>();
       
       map.put(101, new User(101, "Manojit", "manojit.nandi@gmail.com"));
       map.put(102, new User(102, "Kalyan", "kalyan56@gmail.com"));
       map.put(103, new User(103, "Sameer", "sameer79@gmail.com"));
       map.put(104, new User(104, "Bhavna", "bhavna89@gmail.com"));
       
       for(Map.Entry<Integer, User> entry: map.entrySet()) {
           int id = entry.getValue().getId();
           String name = entry.getValue().getName();
           String email = entry.getValue().getEmail();
           
           System.out.println("Id: " + id + " name: " + name + " email: " + email);
       }
    }
}
