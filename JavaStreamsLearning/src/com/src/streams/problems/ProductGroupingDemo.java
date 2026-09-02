package com.src.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.code.common.Product;
public class ProductGroupingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = Arrays.asList(
				new Product("Smartphone", 999.99, "Electronics"),
				new Product("Mens Wear", 599.99, "Clothing"),
				new Product("Womens wear", 999.99, "Clothing"),
				new Product("Radio", 199.99, "Electronics")
			);
		
		Map<String, List<Product>> groupedProducts = products.stream()
											.collect(Collectors.groupingBy(Product::getCategory));
		
		for(var e : groupedProducts.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			for(Product p : e.getValue()) {
				System.out.println("Name: " + p.getName() + " Price: " + p.getPrice() + " Category: " + p.getCategory());
			}
		}
											
	}

}
