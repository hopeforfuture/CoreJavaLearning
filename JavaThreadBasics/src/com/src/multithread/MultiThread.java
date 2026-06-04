/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.multithread;

import com.src.threadbasics.A;

/**
 *
 * @author Manojit Nandi
 */
public class MultiThread {

    public static void main(String[] args) {
        A a = new A();
        a.start();

        /*Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.err.println("Thread B interrupted: " + ex.getMessage());
                        Thread.currentThread().interrupt();
                    }

                }
            }
        };
        
        Thread t = new Thread(r);*/
        Thread t = new Thread(()
                -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.err.println("Thread B interrupted: " + ex.getMessage());
                    Thread.currentThread().interrupt();
                }

            }

        });

        t.start();
    }
}
