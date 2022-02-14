package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	private Scanner sc = new Scanner(System.in);
	private static final int LENGTH = 5;
	private Person[] persons;
	
	 double sumAge;
	 double sumHeight;
	 double sumWeight;
	 double sumProperty;
	 
	 double aveAge;
	 double aveHeight;
	 double aveWeight;
	 double aveProperty;
	
	public PersonController() {
		persons = new Person[LENGTH];
	}
	
	public void inputPersons() {
		for(int i = 0; i< persons.length; i++)
		{
			System.out.println("-----" +LENGTH+ "명의 사람 정보 입력 -----");
			Person p = new Person();
			System.out.print("이름 : ");
			p.setName(sc.next());
			System.out.print("나이 : ");
			p.setAge(sc.nextInt());
			System.out.print("키 : ");
			p.setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			p.setWeight(sc.nextDouble());
			System.out.print("재산 : ");
			p.setProperty(sc.nextDouble());
			persons[i] = p;
		}
		
		System.out.println("> 입력 완료!");
	}
	
	public void printPersons() {
		System.out.println("---------------------------");
		System.out.println("이름  나이  키  몸무개  재산");
		System.out.println("---------------------------");
		for(Person p : persons)
			System.out.println(p.informatrion());
		System.out.println("---------------------------");
	}
	
	public void avePersons() {
		for(Person p : persons) 
		{
			sumAge += p.getAge();
			sumHeight += p.getHeight();
			sumWeight += p.getWeight();
			sumProperty += p.getProperty();
			
			aveAge = sumAge / LENGTH;
			aveHeight = sumHeight / LENGTH;
			aveWeight = sumWeight / LENGTH;
			aveProperty = sumProperty / LENGTH;
		}
		
		System.out.println("평균나이" + aveAge + "평균 키" + aveHeight + "평균 몸무개" + aveWeight + "평균 재산" + aveProperty) ;
		
	}

}
