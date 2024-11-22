package Interfaces;

import java.util.*;

class Product {
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " ($" + price + ")";
	}
}

class PriceAndNameComparator implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		// First compare by price
		int priceComparison = Double.compare(p1.price, p2.price);

		// If prices are the same, compare by name
		if (priceComparison == 0) {
			return p1.name.compareTo(p2.name);
		}

		// Otherwise, return the result of price comparison
		return priceComparison;
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 999.99));
		products.add(new Product("Smartphone", 599.99));
		products.add(new Product("Headphones", 199.99));
		products.add(new Product("Smartphone", 599.99));

		Collections.sort(products, new PriceAndNameComparator()); // Sort using the Comparator

		for (Product product : products) {
			System.out.println(product);
		}
	}
}
