/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class CharFrequency {
    public static void main(String[] args) {
        try {
            Map<Character, Integer> map = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any string: ");
            String str = sc.nextLine();
            
            for(char ch : str.toCharArray()) {
                if(Character.isWhitespace(ch)) {
                    continue;
                }
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            for(char ch : map.keySet()) {
                System.out.println(ch + " : " + map.get(ch));
            }
            
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
