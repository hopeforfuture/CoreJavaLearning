/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.randelement;

import java.util.Random;

/**
 *
 * @author Manojit Nandi
 */
public class ArrayRandElement {
    public static void main(String[] args) {
        int a[] = new int[20];
        Random r = new Random();
        
        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        
        System.out.println("Printing random element:");
        for(int k : a) {
            System.out.print(k + " ");
        }
        System.out.println("");
    }
}
