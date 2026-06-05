/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.arraylistdemo;
import java.util.ArrayList;

/**
 *
 * @author Manojit Nandi
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> fruits2 = new ArrayList<>();
        
        
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Guava");
       
        System.out.println("---------------Showing all fruits-----------------");
        showList(fruits);
        
        fruits.add(1, "Cucumber");
        System.out.println("---------------Showing all fruits-----------------");
        showList(fruits);
        
        String fruit = fruits.get(1);
        System.out.println("Fruit at position 1: " + fruit);
        
        //Update item
        fruits.set(1, "Cherry");
        
        System.out.println("---------------Showing all fruits-----------------");
        showList(fruits);
        
        //Removing an item
        fruits.remove("Watermelon");
        
        System.out.println("---------------Showing all fruits-----------------");
        showList(fruits);
        
        //Adding an item
        fruits.add(1, "Lemon");
        
        System.out.println("---------------Showing all fruits-----------------");
        showList(fruits);
        
        System.out.println("List contains Apple: " + fruits.contains("Apple"));
        
        //Clearing all items
        //fruits.clear();
        //System.out.println("List is empty: " + fruits.isEmpty());
        
        System.out.println("Index of orange: " + fruits.indexOf("Orange"));
        
        //Adding items in fruits2
        fruits2.add("Orange");
        fruits2.add("Banana");
        fruits2.add("Watermelon");
        fruits2.add("Apple");
        
        //retainAll method
        //fruits.retainAll(fruits2);
        
        //System.out.println("---------------Showing all fruits-----------------");
        //showList(fruits);
        
        //removeAll method
        fruits.removeAll(fruits2);
        
        System.out.println("---------------Showing all fruits-----------------");
        showList(fruits);
        
        System.out.println("------Convert this to an array and iterate over this------");
        String[] fruitsArr = fruits.toArray(String[]::new);
        for(String s : fruitsArr) {
            System.out.print(s + " ");
        }
        System.out.println("");
        
        ArrayList<String> fruitsCopy = (ArrayList<String>) fruits.clone();
        
        System.out.println("-------Showing all fruits in the copy object--------");
        showList(fruitsCopy);
    }
    
    public static void showList(ArrayList<String> fruits) {
        for(String s : fruits) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("Size of list: " + fruits.size());
    }
}
