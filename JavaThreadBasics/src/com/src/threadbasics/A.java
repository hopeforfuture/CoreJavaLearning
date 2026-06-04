/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.threadbasics;

/**
 *
 * @author Manojit Nandi
 */
public class A extends Thread {
    
    public void show()
    {
        for(int i=1; i<=10; i++) 
        {
            System.out.println("Hi");
            try {
               Thread.sleep(2000);
            } catch(InterruptedException ex) {
                System.err.println("Thread A interrupted: " + ex.getMessage());
                Thread.currentThread().interrupt();
            }
            
        }
    }
    
    @Override
    public void run() {
        show();
    }
}
