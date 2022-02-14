package com.oop.emp.method.nonstatic;

import java.util.Random;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		Random rnd = new Random();
		
		int[] lotto = new int[6];
		outer:
		for(int i = 0; i < lotto.length; i++)
		{
			int n = rnd.nextInt(45) + 1;
			lotto[i] = n;
			System.out.print(lotto[i] +" ");
			
			for(int j=0;j<i;j++) 
			{			
				if(lotto[i] == lotto[j])
					continue outer;
			}
		}
		System.out.println();
	}
	
	public void outputChar(int a, char b) {
		for(int i = 0; i<a; i++)
		{
			System.out.print(b);
		}
		System.out.println();
	}
	
	public char alphabet() {
		Random rnd = new Random();
		
		char ch = (char)((Math.random()*26)+97);
		System.out.println(ch);
		return ch;
	}
	
	public String mySubstring(String a, int b, int c) {
		if(a.length()==0)
		{
			return null;
		}
		String st = (a.substring(b,c));
		System.out.println(st);
		return st;
	}

}
