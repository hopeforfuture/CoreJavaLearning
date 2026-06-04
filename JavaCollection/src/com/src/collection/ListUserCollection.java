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
public class ListUserCollection {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        
        users.add(new User(1, "Manojit", "manojit87@gmail.com"));
        users.add(new User(2, "Asish", "Asish51@gmail.com"));
        users.add(new User(3, "Saikat", "saikat69@gmail.com"));
        
        for(User u : users) {
            System.out.println("Id: " + u.getId());
            System.out.println("Name: " + u.getName());
            System.out.println("Email: " + u.getEmail());
            
            System.out.println("-----------");
        }
        
        
    }
}
