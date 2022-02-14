package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 main = new Test3();
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
				for(int j = 0; j <= i; j++)
				{
					System.out.print('★');
				}
				System.out.println();
			}
			for(int i = k-1; i>=1; i--)
			{
				for(int j = 0; j< k-i; j++)
				{
					System.out.print(" ");
				}
				for(int m = 1; m<=i; m++)
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
