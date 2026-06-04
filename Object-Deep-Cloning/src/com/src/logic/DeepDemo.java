/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class A {
    private int i,j;
    
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
}
public class DeepDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.setI(10);
        obj.setJ(20);
        
        A obj1 = new A();
        obj1.setI(obj.getI());
        obj1.setJ(obj.getJ());
        
        System.out.println("obj properties: i: " + obj.getI() + " j: " + obj.getJ());
        System.out.println("obj1 properties: i: " + obj1.getI() + " j: " + obj1.getJ());
    }
}
