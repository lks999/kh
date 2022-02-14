package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 main = new Test3();
		main.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 입력 : ");
		int a = sc.nextInt();		
		
		if(a > 1 && a < 10)
		{
			for(int i = 1; i <= 9; i++)
			{
				System.out.printf("%dx%d=%d\n",a, i, a*i);
			}
		}
		else
		{
			System.out.println("잘못입력하셨습니다.");
		}		
	}
}