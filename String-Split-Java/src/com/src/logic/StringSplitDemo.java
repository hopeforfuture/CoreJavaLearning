/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class StringSplitDemo {
    public static void main(String[] args) {
        String str = "Naveen, Durgesh, Akash, Sandy";
        String names[] = str.split(",");
        for(String name : names) {
            System.out.println(name.replaceAll("\\s", ""));
        }
    }
}
