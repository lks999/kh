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
		
		if ( n >= 48 && n <= 57) 
		{
			st = "숫자";
		}
		else if ( (n >= 65 && n <= 90) || (n >= 97 && n <= 122)) 
		{
			st = "알파벳";
		}
		else
			st = "특수문자";
		
		System.out.printf("입력한 문자는 %s입니다",st);
	}

}
