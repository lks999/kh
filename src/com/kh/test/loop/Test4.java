package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 main = new Test4();
		main.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String st= sc.next();
		System.out.print("검색할 문자 입력 : ");
		char ch= sc.next().charAt(0);
		
		int cnt = 0;
		
		if((ch>=97 && ch<=122) || (ch>=65 && ch<=90))
		{
			for(int i = 0; i <st.length(); i++)
			{
				if(st.charAt(i)==ch)
				{
					cnt++;
				}
			}
		}
		else
		{
			System.out.println("영문자가 아닙니다.");
			return;
		}
		System.out.printf("'%c'가 포함된 갯수 : %d개",ch,cnt);
	}

}
