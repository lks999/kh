package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 main = new Test1();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char n = sc.next().charAt(0);
		String st = " ";
		
		if (Character.isDigit(n)) 
		{
			st = "숫자";
		}
		else if (Character.isUpperCase(n) || Character.isLowerCase(n)) 
		{
			st = "알파벳";
		}
		else if(Test1.isKoreanCharacter(n))
		{
			st = "한글";
		}
		else
			st = "특수문자";
		
		System.out.printf("입력한 문자는 %s입니다",st);
	}
	
	public static boolean isKoreanCharacter(char n) {
		return n >= '가' && n <= '힣';
	}

}
