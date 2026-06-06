/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        try {
            Map<Character, Integer> map = new LinkedHashMap<>();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any string: ");
            String str = sc.nextLine();
            
            for(char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            
            for(var e : map.entrySet()) {
                if(e.getValue() == 1) {
                    System.out.println("First character having single occurence: " + e.getKey());
                    break;
                }
            }
            
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
