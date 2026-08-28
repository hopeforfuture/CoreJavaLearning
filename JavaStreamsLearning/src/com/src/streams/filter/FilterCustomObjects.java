package com.src.streams.filter;

import java.util.Arrays;
import java.util.List;

class Product {
  private String name;
  private double price;
  private String category;
  
  public Product(String name, double price, String category) {
	this.name = name;
	this.price = price;
	this.category = category;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public double getPrice() {
	return price;
  }

  public void setPrice(double price) {
	this.price = price;
  }

  public String getCategory() {
	return category;
  }

  public void setCategory(String category) {
	this.category = category;
  }

}

public class FilterCustomObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = Arrays.asList(
					new Product("Smartphone", 999.99, "Electronics"),
					new Product("Mens Wear", 599.99, "Clothing"),
					new Product("Womens wear", 999.99, "Clothing"),
					new Product("Radio", 199.99, "Electronics")
				);
		
		List<Product> filteredProducts = products.stream()
							.filter(p -> p.getCategory().equals("Electronics"))
							.toList();
		
		for(Product p : filteredProducts) {
			System.out.println("Name: " + p.getName() + " Price: " + p.getPrice() + " Category: " + p.getCategory());
		}

	}

}
