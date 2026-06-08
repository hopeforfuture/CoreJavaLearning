/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class Car {
    private double horsePower;
    private String unit;
    
    public Car(double horsePower, String unit) {
        this.horsePower = horsePower;
        this.unit = unit;
    }
    
    class Engine {
        void show() {
            System.out.println("HorsePwer: " + horsePower + " Unit: " + unit);
        }
    }
}



public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car(100, "Watt");
        Car.Engine e = c.new Engine();
        e.show();
    }
}
