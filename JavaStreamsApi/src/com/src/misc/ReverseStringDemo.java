/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.misc;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;


/**
 *
 * @author Manojit Nandi
 */
public class ReverseStringDemo {
    public static String ReverseEachWord(String str) {
        return Stream.of(str.split("")).reduce("", (a,b) -> b + a);
    }
    public static String ReverseEachWordTwo(String str) {
        return IntStream.range(0, str.length())
                .mapToObj(i -> String.valueOf(str.charAt(str.length()-i-1)))
                .collect(Collectors.joining());
    }
    
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any string: ");
            String sentence = sc.nextLine();
            String sentenceWithReverseWord = Arrays.stream(sentence.split(" "))
                    //.map(ReverseStringDemo::ReverseEachWord)
                    .map(ReverseStringDemo::ReverseEachWordTwo)
                    .collect(Collectors.joining(" "));
            System.out.println("Reverse string: " + sentenceWithReverseWord);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
