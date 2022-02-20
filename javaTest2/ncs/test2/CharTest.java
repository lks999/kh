package ncs.test2;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String a = sc.next();
		
		char[] b = a.toCharArray();
		
		for(int i = b.length-1; i>=0; i--)
		{
			System.out.print(Character.toUpperCase(b[i]));
		}

	}

}
