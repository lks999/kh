package com.kh.test.array;

public class Test1 {
	public static void main(String[] args) {
		Test1 main = new Test1();
		main.test();
	}
	
	public void test() {
		int[] a = new int[100];
		int b = 1;
		
		for(int i = 0; i <=99; i++)
		{
			a[i]=b;
			b++;
			System.out.println(a[i]);
		}
	}

}
