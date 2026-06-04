/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.reflectionexplorer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *
 * @author Manojit Nandi
 */
abstract class Shape
{
    protected int height;
    protected int width;
    
    public Shape(int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    
    abstract public double area();
}

class Triangle extends Shape
{
    public Triangle(int h, int w) {
        super(h, w);
    }
    
    @Override
    public double area() {
        return 0.5 * height * width;
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.src.reflectionexplorer.Triangle");
            System.out.println("Parent class of triangle: " + c.getSuperclass());
            Constructor<?> cons = c.getDeclaredConstructor(int.class, int.class);
            Object obj = cons.newInstance(10, 5);
            
            Method m = c.getDeclaredMethod("area");
            System.out.println("Area of the triangle: " + m.invoke(obj));
            
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
