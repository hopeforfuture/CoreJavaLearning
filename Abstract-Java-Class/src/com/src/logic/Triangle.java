/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class Triangle extends Shape {
    private double height;
    private double width;
    
    public Triangle(double h, double w) {
        height = h;
        width  = w;
    }
    
    @Override
    public double area() {
        return 0.5 * height * width;
    }
}
