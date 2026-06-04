/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class Test {
    static int i=0;
    
    public Test() {
        i++;
    }
    
    public void show() {
        System.out.println("Total Object Count: " + i);
    }
}
public class ObjectCount {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        
        t1.show();
    }
}
