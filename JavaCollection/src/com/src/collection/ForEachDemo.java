/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.ArrayList;

/**
 *
 * @author Manojit Nandi
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("Manojit");
        users.add("Sameer");
        users.add("Kavya");
        users.add("Bhavna");
        users.add("Pinaki");
        users.add("Animesh");
        users.add("Pulok");
        
        users.forEach(user -> System.out.println(user));
    }
}
