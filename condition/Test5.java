package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 main = new Test5();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 입력 : ");
		double cm = sc.nextDouble();
		
		System.out.print("몸무게 입력 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / ((cm/100) * (cm/100));
		
		String grade = " "; // char의 기본값
		
		if(bmi >=30)
		{
			grade = "고도비만";
		}
		else if(bmi>=25 && bmi <30)
		{
			grade = "비만";
		}
		else if(bmi>=23 && bmi < 25)
		{
			grade = "과체중";
		}
		else if(bmi>=18.5 && bmi < 23)
		{
			grade = "정상체중";
		}
		else
		{
			grade = "저체중";
		}
		
		System.out.printf("%s입니다",grade);
	}

}
