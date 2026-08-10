/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import com.src.filter.Product;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class GroupingProductsExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "HP Laptop", "Electronics", 40000),
                new Product(2, "Dell Laptop", "Electronics", 35000),
                new Product(3, "Mens Wear", "Clothing", 1000),
                new Product(4, "AC Machine", "Electronics", 50000),
                new Product(5, "Induction Heater", "Electrical", 7000),
                new Product(6, "Core Java: The complete Reference", "Books", 1000),
                new Product(7, "Women's Wear", "Clothing", 1500)
        );
        
        Stream<Product> streamProducts = products.stream();
        
        Map<String, List<Product>> mapProducts = streamProducts.collect(Collectors.groupingBy(Product::getCategory));
        
        for(var e : mapProducts.entrySet()) {
            System.out.println(e.getKey() );
            System.out.println(" ");
            for(var p : e.getValue()) {
                System.out.println("Id: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
            }
            System.out.println("------------------");
        }
        
    }
}
