package com.kh.test.array;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 main = new Test4();
//		main.test1();
		main.test2();
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호 입력 : ");
		String a = sc.nextLine();
		
		char[] b = new char[11];
		
		for(int i = 0; i<a.length(); i++)
		{
			b[i]=a.charAt(i);
		}
		
		char[] c = b.clone();
		
		for(int i = 3; i<7;i++)
		{
			b[i]='*';
		}
		
		System.out.println(b);
//		System.out.println(c); 복사본 정상 출력 확인
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호 입력 : ");
		String a = sc.nextLine();
		
		String b = a.substring(0,3)+"****"+a.substring(7,11);
		System.out.printf("%s",b);
	}

}
