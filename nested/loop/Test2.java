package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 main = new Test2();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("양수 입력 : ");
		int k = sc.nextInt();
		
		if(k>0) 
		{
			for(int i = 0; i < k; i++)
			{
				for(int j = k-1; j >= i; j--)
				{
					System.out.print('★');
				}
				System.out.println();
			}
		}
		else
		{
			System.out.print("양수가 아닙니다.");
		}
	}

}
