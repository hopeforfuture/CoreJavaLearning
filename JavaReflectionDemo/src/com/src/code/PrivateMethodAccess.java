/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *
 * @author Manojit Nandi
 */
public class PrivateMethodAccess {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.src.code.Demo");
            Constructor<?> cons = c.getDeclaredConstructor(int.class, int.class);
            Object obj = cons.newInstance(10, 50);
            
            Method m = c.getDeclaredMethod("getAverage");
            m.setAccessible(true);
            double avg = (double) m.invoke(obj);
            System.out.println(avg);
            
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
