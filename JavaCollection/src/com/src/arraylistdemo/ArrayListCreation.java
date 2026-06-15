/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.arraylistdemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class ArrayListCreation {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        System.out.println("---Creating and showing arraylist in standard way---");
        showList(lst);
        
        System.out.println("---------Creating and showing arraylist from array------------");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        showListUsingIterator(numbers);
        
        System.out.println("-----Showing list using lambda------");
        numbers.forEach(i -> System.out.println(i));
    }
    
    public static void showList(List<Integer> numbers) {
        for(int i : numbers) {
            System.out.println(i);
        }
    }
    
    public static void showListUsingIterator(List<Integer> numbers) {
        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
