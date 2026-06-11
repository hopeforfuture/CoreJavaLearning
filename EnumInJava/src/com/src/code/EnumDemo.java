/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

/**
 *
 * @author Manojit Nandi
 */

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


public class EnumDemo {
    public static void main(String[] args) {
        Day d = Day.MONDAY;
        
        switch(d) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
                
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
                
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
                
            case THRUSDAY:
                System.out.println("Today is Thrusday");
                break; 
                
            case FRIDAY:
                System.out.println("Today is Friday");
                break;    
                
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;    
                
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;  
                
            default:
                System.out.println("Not a valid day");
        }
        
        System.out.println("Printing all the values in day");
        for(Day d1 : Day.values()) {
            System.out.println(d1);
        }
    }
}
