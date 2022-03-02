package com.thread.alphabet;

public class LowerAlphabetThread implements Runnable {

	@Override
	public synchronized void run() {
		
		try 
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		for(int i ='a'; i <='z'; i++)
		{
			System.out.print((char) i);
		}
	}

}
