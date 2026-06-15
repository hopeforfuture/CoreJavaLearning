/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.LinkedHashSet;

/**
 *
 * @author Manojit Nandi
 */
public class RemoveDuplicateDemo {
    public static String getStringAfterRemovingDuplicate(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(char ch : str.toCharArray()) {
            set.add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : set) {
            sb.append(c);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "Programming";
        String mod_str = getStringAfterRemovingDuplicate(str);
        System.out.println("Original string: " + str);
        System.out.println("String after being modified: " + mod_str);
    }
}
