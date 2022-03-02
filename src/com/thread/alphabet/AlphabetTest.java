package com.thread.alphabet;

public class AlphabetTest {

	public static void main(String[] args) {
		
		Thread up = new Thread(new UpperAlphabetThread(), "대문자");
		Thread low = new Thread(new LowerAlphabetThread(), "소문자");
		
		up.start();
		low.start();
	}

}
