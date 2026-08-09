/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class StreamFilteredObjects {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        
        products.add(new Product(1, "Smartphone", "Electronics", 1000));
        products.add(new Product(2, "Induction", "Utensils", 700));
        products.add(new Product(3, "Jeans", "Clothing", 100));
        products.add(new Product(4, "Specs", "Optics", 50));
        products.add(new Product(5, "Television", "Electronics", 900));
        products.add(new Product(6, "AC", "Electronics", 1500));
        
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equals("Electronics"))
                .toList();
        
        filteredProducts.forEach(n -> System.out.println(n));
    }
}
