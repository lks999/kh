package test.controller;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mul = 0;
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if((num1 >= 1 && num1 <= 9) && (num2 >= 1 && num2 <=9))
		{
			mul = num1 * num2;
			
			if(mul>=10)
			{
				System.out.println("두자리 수 입니다.");
			}
			else
			{
				System.out.println("한자리 수 입니다.");
			}
		}
	}
}
