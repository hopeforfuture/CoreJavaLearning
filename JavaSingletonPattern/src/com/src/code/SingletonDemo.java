/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

/**
 *
 * @author Manojit Nandi
 */
class Abc {
   public static Abc obj;
    
    private Abc() {
        System.out.println("Instance created.");
    }
    
    static public synchronized Abc getInstance() {
        if(obj == null) {
            obj = new Abc();
        }
        return obj;
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        
        //Abc obj1;
        //Abc obj2;
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               Abc obj1 = Abc.getInstance();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               Abc obj2 = Abc.getInstance();
            }
        });
        
        t1.start();
        t2.start();
        
        
        //boolean flag = obj1 == obj2;
        //System.out.println("obj1 == obj2: " + flag);
    }
}
