package com.kh.test.condition;

import java.util.Scanner;

public class Test4 
{
	public static void main(String[] args) {
		Test4 main = new Test4();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		if(n >= 1 && n <= 10)
		{
			if(n % 2 == 0)
			{
				System.out.println("짝수다");
			}
			else
			{
				System.out.println("홀수다");
			}
		}
		else
		{
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
		}
	}

}
