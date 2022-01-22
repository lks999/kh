package com.kh.test;

public class Test2 {
	
	public static void main(String[] args) {
		
		String name = "이경석";
		int age = 27;
		char s = '남';
		String address ="경기도 군포시";
		String number = "010-0000-0000";
		String email = "0000@naver.com";
		
		System.out.println("=======================================================================\r\n"
				+ "\t이름\t나이\t성별\t전화번호\t\t이메일\t\t주소\r\n"
				+ "=======================================================================");
		
		System.out.printf("\t%s\t%d\t%c\t%s\t%s\t%s\n",name,age,s,number,email,address);
		
		name = "홀길동";
		age = 22;
		address = "경기도 광주시";
		number ="010-1234-1234";
		email = "hgd@naver.com";
		
		System.out.printf("\t%s\t%d\t%c\t%s\t%s\t%s\n",name,age,s,number,email,address);
		
		name = "홀길순";
		age = 20;
		s ='여';
		address = "전라남도 광주시";
		number ="010-1234-12341";
		email = "hgs@naver.com";
		
		System.out.printf("\t%s\t%d\t%c\t%s\t%s\t%s\n",name,age,s,number,email,address);
		
	}

}
