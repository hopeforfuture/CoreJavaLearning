/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

/**
 *
 * @author Manojit Nandi
 */
public class AgeFinder {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter date of Birth in YYYY-MM-DD format: ");
            String dobStr = sc.nextLine();
            LocalDate dob = LocalDate.parse(dobStr);
            LocalDate now = LocalDate.now();
            
            Period period = Period.between(dob, now);
            
            System.out.println("Age is: " + period.getYears() + " Years " + period.getMonths() +" Months " + period.getDays() + " Days");
        }   
         
    }
}
