package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Test3 main = new Test3();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int n = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("연산자 입력 : ");
		char ch = sc.next().charAt(0);
		
		if(n > 0 && a > 0 && ch == '+')
		{
			System.out.printf("%d + %d = %d\n", n, a, n+a);
		}
		else if(n > 0 && a > 0 && ch == '-')
		{
			System.out.printf("%d - %d = %d\n", n, a, n-a);
		}
		else if(n > 0 && a > 0 && ch == '*')
		{
			System.out.printf("%d * %d = %d\n", n, a, n*a);
		}
		else if(n > 0 && a > 0 && ch == '/')
		{
			System.out.printf("%d / %d = %d\n", n, a, n/a);
		}
		else
		{
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

}
