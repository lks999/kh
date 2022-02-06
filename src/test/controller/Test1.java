package test.controller;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		
		if(i >= 1 && i <= 100)
		{
			if(i % 2 == 0)
			{
				System.out.println("2의 배수입니다.");
			}
			else
			{
				System.out.println("2의 배수가 아닙니다.");
			}
		}
		else
		{
			System.out.println("1에서 100사이의 값을 입력해주세요.");
		}
	}
}
