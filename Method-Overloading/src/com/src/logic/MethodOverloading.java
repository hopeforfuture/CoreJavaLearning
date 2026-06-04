/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class Temp {
    public void show() {
        System.out.println("Show method without parameter");
    }
    
    public void show(int i) {
        System.out.println("Show method with parameter : " + i);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Temp t = new Temp();
        t.show(101);
    }
}
