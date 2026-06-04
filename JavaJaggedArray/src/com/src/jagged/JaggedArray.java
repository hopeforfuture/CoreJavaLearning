/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.jagged;

import java.util.Random;

/**
 *
 * @author Manojit Nandi
 */
public class JaggedArray {

    public static void main(String[] args) {
        Random r = new Random();
        int p[][] = new int[3][];
        p[0] = new int[4];
        p[1] = new int[9];
        p[2] = new int[7];

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                p[i][j] = r.nextInt(100);
            }
        }

        for (int a[] : p) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println("");
        }

    }
}
