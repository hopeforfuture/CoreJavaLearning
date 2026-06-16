/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.limit;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author Manojit Nandi
 */
public class DistinctWithLimit {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,1,1,2,3,4,2,5,19,-11,19,21,101,-302,234,233,19);
        nums.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
