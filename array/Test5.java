package com.kh.test.array;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 main = new Test5();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 입력 ex)000000-0000000 : ");
		String a = sc.nextLine();
		char[] b = new char[a.length()];
		
		
		for(int i = 0; i<a.length(); i++)
		{
			b[i]=a.charAt(i);
		}
		
		char[] c = b.clone(); 
		
		for(int i = 8; i<a.length(); i++)
		{
			b[i]='*';
		}
		
		System.out.println(b);
//		System.out.println(c); 클론 출력 확인
		
	}

}
