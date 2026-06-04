/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.randelement;

/**
 *
 * @author Manojit Nandi
 */
public class EnhancedForloop2DArray {
    public static void main(String[] args) {
        int p[][] = {
            {5,6,7,8},
            {6,7,8,9},
            {9,0,11,21}
        };
        
        for(int i[] : p) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
