package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;

public class Run {
	
	public static void main(String[] args) {
		CoffeeManager coffees = new CoffeeManager();
		coffees.inputCoffee();
		coffees.printCoffee();
		
	}

}
