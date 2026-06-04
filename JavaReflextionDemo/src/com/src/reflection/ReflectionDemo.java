/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.reflection;

import java.lang.reflect.Method;

/**
 *
 * @author Manojit Nandi
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.src.reflection.Test");
            Test t = (Test)c.getDeclaredConstructor().newInstance();
            
            Method m = c.getDeclaredMethod("show");
            m.setAccessible(true);
            m.invoke(t);
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
