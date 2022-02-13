package com.oop.person.model;

public class Person {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private double property;
	
	public Person() {
		
	}
	
	public Person(String name, int age, double height, double weight, double property) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.property = property;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setProperty(double property) {
		this.property = property;
	}
	public double getProperty() {
		return property;
	}
	
	public String informatrion() {
		return name + "  " + age + "  " + height + "  " + weight + "  " + property;
	}

}
