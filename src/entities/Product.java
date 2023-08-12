package entities;

import model.entities.ProductException;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	
	
	public Product() {
		
	}


	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}


	public Integer getQuantity() {
		return quantity;
	}
	
	public Double total() {
		return price*quantity;
	}
	
	private void errors(){
		if(price == null) {
			throw new ProductException ("Error: You can't stay price null");
		}
		if(quantity == null) {
			throw new ProductException("Error: You can't leave quantity null");
		}
		
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", total())+ "\n";
	}
	
	
	
}
