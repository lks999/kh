package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("******* 사원 정보 관리 프로그램 ************");
		System.out.print("1. 새 사원 정보 입력\n"+
						 "2. 사원 정보 삭제\n"+"3. 사원정보 출력\n"+"9. 끝내기\n");		
		System.out.println("********************************************");

		
		while(true)
		{
			int n = sc.nextInt();
			switch(n)
			{
			case 1 : emp.empInput();
			break;
			case 2 : emp = null;
			break;
			case 3 : emp.empOutput();
			break;
			case 9 : System.out.println("종료");;
			break;
			default : System.out.println("1,2,3,9 숫자만 입력하세요.");
			break;
			}
		}
	}

}
