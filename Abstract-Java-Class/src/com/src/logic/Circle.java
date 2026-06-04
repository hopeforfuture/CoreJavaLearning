/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class Circle extends Shape {
   private double radius;
   
   public Circle(double r) {
       radius = r;
   }
   
   @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
