package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import model.entities.ProductException;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	List <Product> list = new ArrayList<>();
	try {
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
	}
	catch (InputMismatchException e) {
		System.out.println("Invalid information");
	}
	catch (ProductException e) {
		System.out.println("Price error: " + e.getMessage());
	}
	catch (RuntimeException e) {
		System.out.println("Unexpected error");
	}
	
	sc.close();
		
	}

}
