package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	List <Product> list = new ArrayList<>();
	for(int i =0; i<4; i++) {
		System.out.println("Enter data products: ");
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double value = sc.nextDouble();
		System.out.print("Quantity: ");
		Integer quantity = sc.nextInt();
		Product product = new Product(name, value, quantity);
		list.add(product);
		System.out.println();

	}
	
	for(Product p: list) {
		System.out.print(p);
	}
	
	sc.close();
		
	}

}
