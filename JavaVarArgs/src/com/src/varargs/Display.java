/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.varargs;

/**
 *
 * @author Manojit Nandi
 */
public class Display {
    public void show(int ... a) {
        for(int k : a) {
            System.out.print(k + " ");
        }
        System.out.println("");
    }
}
