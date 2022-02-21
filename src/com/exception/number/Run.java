package com.exception.number;

import java.util.Scanner;

public class Run {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Run run = new Run();
		run.test();
	}
	
	public void test() {
		
		NumberProcess num = new NumberProcess();
		
		try
		{
			System.out.printf("첫 번째 정수 입력 : ");
			int a = sc.nextInt();
			System.out.printf("두 번째 정수 입력 : ");
			int b = sc.nextInt();
			
			if(num.checkDouble(a, b) == true)
			{
				System.out.printf("%d는 %d의 배수이다.",a,b);
			}
			else
			{
				System.out.printf("%d는 %d의 배수가 아니다.",a,b);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
