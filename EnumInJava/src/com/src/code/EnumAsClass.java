/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

enum Laptop {
    Acer(35000), 
    Hp(40000),
    Mackbook(100000),
    Dell(50000);
    
    private int price;

    private Laptop(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

/**
 *
 * @author Manojit Nandi
 */
public class EnumAsClass {
    public static void main(String[] args) {
        Laptop[] laptops = Laptop.values();
        
        for(Laptop l : laptops) {
            System.out.println(l + " : " + l.getPrice()); 
        }
    }
}
