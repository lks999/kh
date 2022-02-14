package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) 	{
		SwitchTest1 main = new SwitchTest1();
		main.test1();
	}
	
	public void test1()	{
		Scanner sc = new Scanner(System.in);
		String menu ="----------menu----------\n"
				+ "1. 가정용 (50원/liter)\n"
				+ "2. 상업용 (45원/liter)\n"
				+ "3. 공업용 (30원/liter)\n"
				+ "---------------------------";
		
		int choice = 0;
		int water = 0;
		int price = 0;
		int a = 0;
		int b = 0;
		
		String st = "";
		
			System.out.println(menu);
			
			System.out.print("메뉴번호를 선택하세요. ==>");
			choice = sc.nextInt();
			System.out.print("물 사용량을 입력하세요. ==>");
			water = sc.nextInt();
			
			// 결제금액 합산
			switch(choice)
			{
			case 1: st += "1. 가정용";
					price = 50;
					break;
			case 2: st += "2. 상업용";
					price = 45;
					break;
			case 3: st += "3. 공업용";
					price = 30;
					break;
			default: System.out.println("메뉴번호는 1,2,3만 가능합니다.");
					 return;
			} 
			
			a = price * water;
			b = a / 20;
			
			System.out.println("----------<<수도세>>----------");
			System.out.printf("선택메뉴번호 : %s를 선택하셨습니다.\n",st);
			System.out.printf("사용요금 : %d\n", a);
			System.out.printf("수도세 : %d\n", b);
			System.out.printf("총수도요금 : %d원\n",a+b);
	}
}
