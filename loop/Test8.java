package com.kh.test.loop;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Test8 main = new Test8();
		main.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		int n= 0;
		int choice = 0;
		String name = "";
		int total = 0;
		String result = "";
		
		String menu = "메뉴\n"
				+ "김밥류 ===================\r\n"
				+ "1.원조김밥===========1500원\r\n"
				+ "2.치즈김밥===========2000원\r\n"
				+ "3.참치김밥===========2300원\r\n"
				+ "라면류 ===================\r\n"
				+ "4.그냥라면===========3000원\r\n"
				+ "5.치즈라면===========3500원\r\n"
				+ "6.짬뽕라면===========4000원\r\n"
				+ "분식류 ===================\r\n"
				+ "7.떡볶이=============2500원\r\n"
				+ "8.순대==============2500원\r\n"
				+ "9.오뎅==============1000원\r\n"
				+ "기타 ====================\r\n"
				+ "10.음료수===========1000원\n"
				+ "입력 : ";
		do
		{
			System.out.println(menu);
			choice = sc.nextInt();
			System.out.println("수량 선택 : ");
			n = sc.nextInt();

			switch(choice)
			{
			case 1: name = "원조김밥";
					total+= (1500*n);
			break;
			case 2: name = "치즈김밥";
					total+= (2000*n);
			break;
			case 3: name = "참치김밥";
					total+= (2300*n);
			break;
			case 4: name = "그냥라면";
					total+= (3000*n);
			break;
			case 5: name = "치즈라면";
					total+= (3500*n);
			break;
			case 6: name = "짬뽕라면";
					total+= (4000*n);
			break;
			case 7: name = "떡볶이";
					total+= (2500*n);
			break;
			case 8: name = "순대";
					total+= (2500*n);
			break;
			case 9: name = "오뎅";
					total+= (1000*n);
			break;
			case 10: name = "음료수";
					total+= (1000*n);
			break;
			default: System.out.println("잘못 누르셨습니다.");
			}
			
			result += name + ":" + n + "개 -" + total + "원\n";
			
			System.out.print("계속 하시겠습니까? (y/n)");
			char yn = sc.next().charAt(0);
			if(yn == 'y')
				continue;
			if(yn == 'n')
				break;
		}while(true);
		
		System.out.println("결과\n주문하신 정보는 다음과 같습니다.");
		System.out.println("----------------------------");
		System.out.printf(result);
		System.out.println("----------------------------");
	}

}
