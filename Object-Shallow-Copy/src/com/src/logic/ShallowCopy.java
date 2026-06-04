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
    public int i,j;
    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
}
public class ShallowCopy {
    public static void main(String[] args) {
        A obj = new A(10, 20);
        A obj1 = obj;
        
        System.out.println("obj properties: " + obj.i + " " + obj.j);
        System.out.println("obj1 properties: " + obj1.i + " " + obj1.j);
        
        obj1.i = 15;
        obj1.j = 25;
        
        System.out.println("obj properties: " + obj.i + " " + obj.j);
        System.out.println("obj1 properties: " + obj1.i + " " + obj1.j);
    }
}
