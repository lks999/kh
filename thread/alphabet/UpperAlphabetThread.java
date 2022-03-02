package com.thread.alphabet;

public class UpperAlphabetThread implements Runnable {

	@Override
	public synchronized void run() {
		
		for(int i ='A'; i <='Z'; i++)
		{
			System.out.print((char) i);
		}
		System.out.println();
	}

}
