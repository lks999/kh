package com.kh.star;

public class Star {
	public static void main(String[] args) {
		Star main = new Star();
		main.test1();
//		main.test2();
//		main.test3();
//		main.test4();
//		main.test5();
//		main.test6();
//		main.test7();
	}
	
	public void test1() {
		for(int i = 0; i < 5; i++)
		{
			for(int j = 5; j > i; j--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void test2() {
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void test3() {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j > 0; j--)
			{
				if(j>i)
				{
					System.out.print(' ');
				}
				else
				{
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	public void test4() {
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j<4-i; j++)
			{
				System.out.print(' ');
			}
			for(int j = 0; j<2*i+1;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void test5() {
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j < i; j++) 
			{
				System.out.print("  ");
			}
			for(int j = 3; j >= 2 * i - 1; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void test6() {
		for(int i = 1; i <= 2; i++) 
		{
			for(int j = 1; j <= 3 - i; j++) 
			{
				System.out.print("  ");
			}
			for(int k = 1; k <= 2 * i - 1; k++) 
			{
					System.out.print("*");					
			}
			System.out.println();
		}
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j < i; j++) 
			{
				System.out.print("  ");
			}
			for(int j = 3; j >= 2 * i - 1; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public void test7() {
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j<2-i; j++)
			{
				System.out.print(' ');
			}
			for(int j = 0; j<2*i+1;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		for (int i=2; i>0; i--) 
		{
		    for (int j=3-i; j>0; j--) 
		    {
		    	System.out.print(" ");
		    }
		    for (int j=i*2-1; j>0; j--) 
		    {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
