package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Run run = new Run();
		run.test1();

	}
	
	public void test1() {
		 CharacterProcess ch = new CharacterProcess();
		 
		 try
		 {
			 System.out.print("알파벳 입력 : ");
			 String s = sc.nextLine();
			 System.out.println("알파벳 개수 : " + ch.countAlpha(s));
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
