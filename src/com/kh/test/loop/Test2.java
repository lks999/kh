package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 main = new Test2();
		main.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++)
		{
			if(i % 2 == 1)
			{
				System.out.print("수");
			}
			else
			{
				System.out.print("박");
			}
		}
	}
}
