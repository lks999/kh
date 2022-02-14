package com.kh.function;

import java.util.Scanner;

public class Example {
	
	public void opSample1() {	
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, sum;
		double ave;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		ave = sum / 3;

		String s = (kor >= 40 && eng >= 40 && math >= 40 && ave >= 60) ? "합격" : "불합격";
		System.out.println(s);
	}
	
	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int year, Class, number;
		float grade;
		char gender;
		
		System.out.print("학생이름 : ");
		name = sc.nextLine();
		
		System.out.print("학년 : ");
		year = sc.nextInt();
		
		System.out.print("반 : ");
		Class = sc.nextInt();
		
		System.out.print("번호 : ");
		number = sc.nextInt();
		
		System.out.print("성별(남|여) : ");
		String temp = sc.next(); 
		gender = temp.charAt(0);
		
		System.out.print("성적 : ");
		grade = sc.nextFloat();
		String gr = String.format("%.2f", grade);
		
		System.out.println(year + "학년 " + Class +"반 " + number +"번 " 
		+ gender +"학생 "+ name +"은 성적이 "+ gr + "이다." );
		
	}
	
	public void opSample3() {
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		
		String s = (a > 0) ? "양수다" : "양수가 아니다";
		System.out.println(s);
	}
	
	public void opSample4() {
		Scanner sc = new Scanner(System.in);
		
		int a;
		String b;
		
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		
		String s = (a % 2 == 0) ? (b = "짝수다") : (b = "홀수다");
		System.out.println(b);
		
	}

}
