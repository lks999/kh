package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	private Scanner sc = new Scanner(System.in);
	private static final int LENGTH = 3;
	private Coffee[] Coffees;
	
	public CoffeeManager() {
		Coffees = new Coffee[LENGTH];
	}
	
	public void inputCoffee() {
		for(int i = 0; i< Coffees.length; i++)
		{
			System.out.println("-----" +LENGTH+ "개 원산지와 커피명 입력 -----");
			Coffee c = new Coffee();
			System.out.print("원산지 : ");
			c.setOrigin(sc.next());
			System.out.print("커피명 : ");
			c.setCoffeeName(sc.next());
			Coffees[i] = c;
		}
		
		System.out.println("> 입력 완료!");
	}
	
	public void printCoffee() {
		System.out.println("---------------------------");
		System.out.println("원산지			커피명");
		System.out.println("---------------------------");
		for(Coffee c : Coffees)
			System.out.println(c.printCoffeeInfo());
		System.out.println("---------------------------");
	}

}
