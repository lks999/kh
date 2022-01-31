package com.kh.test.array;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 main = new Test3();
		main.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String st= sc.next();
		System.out.print("검색할 문자 입력 : ");
		char ch= sc.next().charAt(0);
		
		int cnt = 0;
		
		char[] a = st.toCharArray();
		
		for(int i = 0; i<st.length();i++)
		{
			if(st.charAt(i)==ch)
			{
				cnt++;
			}
		}
		
		System.out.printf("입력값 : %s\n",st);
		System.out.printf("검색값 : %c\n",ch);
		System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c은 %d개 입니다\n",st,ch,cnt);

	}

}
