package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 main = new Test1();
//		main.test1();
		main.test2();
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int mul = 1;
		
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 1)
			{
			mul *=i;
			}
		}
		System.out.println(mul);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a= sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b= sc.nextInt();
		int sum = 0;
		if(a<b)
		{
			for(int i = a; i<=b; i++)
			{
				if(i % 2 == 1)
				{
				sum +=i;
				}
			}
			System.out.printf("%d부터 %d까지 홀수의 합은 %d입니다.",a,b,sum);
		}
		else
		{
			for(int i = b; i<=a; i++)
			{
				if(i % 2 == 1)
				{
				sum +=i;
				}
			}
			System.out.printf("%d부터 %d까지 홀수의 합은 %d입니다.",b,a,sum);
		}
		
	}

}
