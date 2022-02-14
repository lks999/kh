package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	Scanner sc = new Scanner(System.in);
	Employee emp = new Employee();
	
	public static void main(String[] args) {
		EmpTest emp = new EmpTest();
		emp.test();
	}
	
	public void test() {
		
		String menu = "******* 사원 정보 관리 프로그램 ************\n"+
						"1. 새 사원 정보 입력\n"+
						"2. 사원 정보 수정\n"+
						"3. 사원정보 삭제\n"+
						"4. 사원정보 출력\n"+
						"9. 끝내기\n"+
						"********************************************\n";
		
		while(true)
		{
			System.out.print(menu);
			System.out.print("메뉴 선택 : ");
			int n = sc.nextInt();
			
			switch(n)
			{
			case 1 : emp.empInput();
			break;
			case 2 : modifyMenu(emp);
			break;
			case 3 : emp = null;
			break;
			case 4 : emp.empOutput();
			break;
			case 9 : System.out.println("프로그램 종료");
			return;
			default : System.out.println("잘못된 번호 입니다.");
			}
		}	
	}
	
	public void modifyMenu(Employee e) {
		
		String menu = "********** 사원 정보 수정 메뉴 **********\n"+
				"1. 이름 변경\n"+
				"2. 급여 변경\n"+
				"3. 부서 변경\n"+
				"4. 직급 변경\n"+
				"5. 이전 메뉴로 이동\n"+
				"********************************************\n";
		
		while(true)
		{
			System.out.print(menu);
			System.out.print("메뉴 선택 : ");
			int n = sc.nextInt();
			
			switch(n)
			{
			case 1 :
				System.out.print("이름 변경 : ");
				emp.setEmpName(sc.next());
			break;
			case 2 :
				System.out.print("급여 변경 : ");
				emp.setSalary(sc.nextInt());
			break;
			case 3 :
				System.out.print("부서 변경 : ");
				emp.setDept(sc.nextLine());
			break;
			case 4 : 
				System.out.print("직급 변경 : ");
				emp.setJob(sc.nextLine());
			break;
			case 5 : System.out.println("이전 메뉴로 이동");
			return;
			default : System.out.println("잘못된 번호 입니다.");
			}
		}
	}
}
