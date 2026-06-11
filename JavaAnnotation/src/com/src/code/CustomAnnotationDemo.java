package com.src.code;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manojit Nandi
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
    String os() default "Symbian";
    int version() default 1;
}

@SmartPhone(os="Android", version=1)
class NokiaASeries
{
    String model;
    int size;
    
    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
    
    public void show() {
        System.out.println("Showing details for Nokia");
    }
}


public class CustomAnnotationDemo {
    public static void main(String[] args) {
        NokiaASeries obj = new NokiaASeries("Fire", 5);
        
        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println("Os: " + s.os() + " Version: " + s.version());
    }
}
