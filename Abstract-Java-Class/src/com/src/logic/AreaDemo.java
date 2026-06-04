/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class AreaDemo {
    public static void main(String[] args) {
        Triangle t = new Triangle(12.5, 6.4);
        double area = t.area();
        System.out.println("Triangle area: " + area);
        
        Circle c = new Circle(6.5);
        area     = c.area();
        System.out.println("Triangle area: " + area);
    }
}
