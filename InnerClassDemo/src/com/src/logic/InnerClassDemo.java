/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */


public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
