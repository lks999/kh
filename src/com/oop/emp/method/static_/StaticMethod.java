package com.oop.emp.method.static_;

public class StaticMethod {
	
	public static String toUpper(String a) {
		String ch = a;
		
		String chup = ch.toUpperCase();
		System.out.println(chup);
		return chup;
	}
	
	public static String setChar(String a, int b, char c) {
		
		String ch = a;
		String newch = ch.substring(0,b) + c +ch.substring(b+1);
			
		System.out.println(newch);
		
		return newch;
	}
	

	public static int getAlphabetLength(String a) {
		String ch = a;
		int i = 0;
		
		for(int j = 0; j <ch.length(); j++)
		{
			if((ch.charAt(j)>64 && ch.charAt(j)<91)||(ch.charAt(j)>96 && ch.charAt(j)<123))
			i++;
		}
		
		System.out.println(i+"개");
		return i;
	}
	
	public static String concat(String a, String b) {
		String ch = a;
		String ch2 =b;
		String ch3 = ch+ch2;
		
		System.out.println(ch3);
		return ch3;
		
	}
	
	
}
