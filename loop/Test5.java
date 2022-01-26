package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 main = new Test5();
		main.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 회원 수 : ");
		int n = sc.nextInt();
		
		String[] name = new String[n];   
		int[] age = new int[n];		   
		String[] addr = new String[n];   
		int[] height = new int[n]; 
		int[] weight = new int[n]; 
		String[] phone = new String[n];
		
		for(int i = 0; i < n; i++) 
		{	
			System.out.print("이름 : ");
			name[i] = sc.next();
			
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
			sc.nextLine();
	
			System.out.print("주소 : ");
			addr[i] = sc.nextLine();
			
			System.out.print("키 : ");
			height[i] = sc.nextInt();
			
			System.out.print("몸무게 : ");
			weight[i] = sc.nextInt();
			
			System.out.print("연락처 : ");
			phone[i] = sc.next();		
			
			System.out.println();
		}
		System.out.println("================저장회원=================");
		
		for(int i = 0; i < n; i++) 
		{
			System.out.printf("%d %s %d세 %s %dcm %dkg %s%n", i, name[i], age[i], addr[i], height[i], weight[i], phone[i]);
		}
	
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i = 0; i < n; i++) 
		{
			sum1 += age[i];
			sum2 += height[i];
			sum3 += weight[i];
		}
		
		System.out.printf("평균나이 : %d세 / 평균 키 : %dCM / 평균 몸무게 : %dkg ",sum1/n, sum2/n, sum3/n);
	}

}
