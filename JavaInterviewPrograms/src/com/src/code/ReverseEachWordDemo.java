/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class ReverseEachWordDemo {
    public static String EachWordReverse(String str) {
        return str.chars().mapToObj(ch -> String.valueOf((char)ch))
                .reduce("", (a,b) -> b+a);
    }
    public static void main(String[] args) {
        String str = "My experiment with truth";
        String strEachWordReverse = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(strEachWordReverse);
        
        String strEachWordReverseTwo = Arrays.stream(str.split(" ")).map(ReverseEachWordDemo::EachWordReverse)
                .collect(Collectors.joining(" "));
        
        System.out.println(strEachWordReverseTwo);
    }
}
