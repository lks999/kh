package com.kh.test.array;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 main = new Test6();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 입력 : ");
		int a = sc.nextInt();
		
		int[] b = new int[a];
		
		System.out.print("[");
		
		for(int i = 0; i<b.length; i++)
		{
			if(i>b.length/2)
			{
				b[i] = b.length -i;
			}
			else
			{
				b[i] = i + 1;
			}
			
			System.out.print(b[i]);
			
		}
		System.out.printf("]");
	}

}
