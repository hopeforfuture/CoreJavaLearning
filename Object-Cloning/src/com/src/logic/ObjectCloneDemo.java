/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class A implements Cloneable {
    private int i, j;
    public A(int i, int j) {
       this.i = i;
       this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getJ() {
        return j;
    }

    
    @Override
    public String toString() {
        return "A{" + "i=" + i + ", j=" + j + '}';
    }
    
    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new Error("Something impossible just happened");
        }
    }
    
}
public class ObjectCloneDemo {
    public static void main(String[] args) {
        A obj = new A(10, 20);
        A obj1 = (A) obj.clone();
        
        System.out.println("obj properties: i: " + obj.getI() + " j: " + obj.getJ());
        System.out.println("obj1 properties: i: " + obj1.getI() + " j: " + obj1.getJ());
    }
}
