package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 main = new Test1();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		for(int i = 1; i<=a; i++)
		{
			System.out.print(i + " ");
		}
	}

}
