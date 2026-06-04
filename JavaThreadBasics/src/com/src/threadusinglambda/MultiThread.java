/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.threadusinglambda;

/**
 *
 * @author Manojit Nandi
 */
public class MultiThread {
    
    public void show(String str, int milliseconds) {
        try {
            for(int i=1; i<=10; i++) {
                System.out.println(str);
                Thread.sleep(milliseconds);
            }
        }
        catch(InterruptedException ex) {
            System.err.println("Thread interrupted: " + ex.getMessage());
            Thread.currentThread().interrupt();
        }
    }
    
    
    public static void main(String[] args) {
        new Thread(() 
        -> {
            new MultiThread().show("Hi", 1000);
        }).start();
        
        try {
            Thread.sleep(100);
        } catch(InterruptedException ex) {
            System.err.println("Main Thread interrupted: " + ex.getMessage());
            Thread.currentThread().interrupt();
        }
        
        new Thread(() 
        -> {
            new MultiThread().show("Hello", 1500);
        }).start();
    }
}
