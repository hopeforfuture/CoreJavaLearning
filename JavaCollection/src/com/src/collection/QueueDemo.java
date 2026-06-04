/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author Manojit Nandi
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<User> users = new LinkedList<>();
        
        users.offer(new User(101, "Manojit", "manojit87@gmail.com"));
        users.offer(new User(102, "Akash", "akash56@gmail.com"));
        users.offer(new User(103, "Baljeet", "baljeet49@gmail.com"));
        users.offer(new User(104, "Sameer", "sameer57@gmail.com"));
        users.offer(new User(105, "Kaushik", "kaushik77@gmail.com"));
        users.offer(new User(106, "Payel", "payel88@gmail.com"));
        
        while(!users.isEmpty()) {
            User u = users.poll();
            System.out.println("Id: " + u.getId() + " Name: " + u.getName() + " Email: " + u.getEmail());
        }
    }
}
