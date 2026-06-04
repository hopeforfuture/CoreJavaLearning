/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.stringdemo;

/**
 *
 * @author Manojit Nandi
 */
public class StringMethodDemo {
    public static void main(String[] args) {
        //Find string length
        String str = "Hello";
        int len = str.length();
        System.out.printf("The length of %s: %d", str, len);
        System.out.println("");
        
        //Extract a character
        String str1 = "Java";
        System.out.printf("Char at position 2 : %c", str1.charAt(2));
        System.out.println("");
        
        //concat one or more strings using concat method
        String str2 = "Hello";
        String str3 = "World";
        System.out.println(str2.concat(" ").concat(str3));
        
        //Change letters to uppercase
        String str4 = "java";
        System.out.printf("uppercase version of %s : %s", str4, str4.toUpperCase());
        System.out.println("");
        
        //Change letters tolowercase
        String str5 = "JAVA";
        System.out.printf("lowercase version of %s : %s", str5, str5.toLowerCase());
        System.out.println("");
        
        //to check whether two strings are equals or not
        String str6 = "jAvA";
        String str7 = "Java";
        System.out.printf("%s and %s are equals: %b", str6, str7, str6.equals(str7));
        System.out.println("");
        System.out.printf("%s and %s are equals if case to be ignored: %b", str6, str7, str6.equalsIgnoreCase(str7));
        System.out.println("");
        
        //compare two different strings
        String str8 = "apple";
        String str9 = "banana";
        System.out.printf("%s compared to %s: %d", str8, str9, str8.compareTo(str9));
        System.out.println("");
        
        //to explore contains method
        String str10 = "Wecome to Java";
        System.out.printf("%s contains %s : %b", str10, "Java", str10.contains("Java"));
        System.out.println("");
        
        //Try with startsWith method
        String str11 = "Java Programming";
        System.out.printf("%s starts with %s : %b", str11, "Java", str11.startsWith("Java"));
        System.out.println("");
        
        //Try with endsWith method
        String str12 = "Hello.java";
        System.out.printf("%s ends with %s : %b", str12, ".java", str12.endsWith(".java"));
        System.out.println("");
        
        //indexOf method
        String str13 = "Programming";
        char ch = 'g';
        System.out.printf("Index of %c in %s : %d", ch, str13, str13.indexOf(ch));
        System.out.println("");
        
        //lastIndexOf method
        System.out.printf("Last Index of %c in %s : %d", ch, str13, str13.lastIndexOf(ch));
        System.out.println("");
        
        //Substring method in java
        int start = 3;
        int end = 7;
        System.out.printf("Char from start index %d to end index %d in the string %s : %s", start, end, str13, str13.substring(start, end));
        System.out.println("");
        
        //Replace method in Java
        String str14 = "Java";
        System.out.printf("replacing a with o in the string %s and final string becomes: %s", str14, str14.replace('a', 'o'));
        System.out.println("");
        
        String str15 = "Java,Python,C#";
        String[] strarr = str15.split(",");
        for(String s : strarr) {
            System.out.print(s + " "); 
        }
        System.out.println("");
        
        String str16 = "";
        System.out.println(str16.isEmpty());
        
        //Exploring join() method
        System.out.println(String.join("-", "2026", "06", "02"));
    }
}
