/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.List;
import java.util.Arrays;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + '}';
    }
    
}

/**
 *
 * @author Manojit Nandi
 */
public class UserAgeSorted {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Manojit", 39),
                new User("Devdeep", 13),
                new User("Sanjay", 25),
                new User("Dutta", 59),
                new User("Raj", 42),
                new User("Jayadeep", 29)  
        );
        
        List<User> sortedUsers = users.stream()
                                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                                .toList();
        
        for(User u : sortedUsers) {
            System.out.println("Name: " + u.getName() + " Age: " + u.getAge());
        }
    }
}
