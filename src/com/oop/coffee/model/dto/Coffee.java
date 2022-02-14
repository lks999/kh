package com.oop.coffee.model.dto;

public class Coffee {
	
	private String origin;
	private String coffeeName;
	
	public Coffee() {
		
	}
	
	public Coffee(String origin, String coffeeName) {
		this.origin = origin;
		this.coffeeName = coffeeName;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	public String getCoffeeName() {
		return coffeeName; 
	}
	
	public String printCoffeeInfo() {
		return  origin + "			" +coffeeName;
	}

}
