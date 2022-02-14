package com.kh.test.multi.dimentional.array.test;

import java.util.Random;

public class Sample {
	public static void main(String[] args) {
		Sample main = new Sample();
//		main.exercise1();
		main.exercise2();
	}
	
	public void exercise1() {
		Random rnd = new Random();
		int[][] arr = new int[3][5];
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[0].length; j++)
			{
				arr[i][j]=rnd.nextInt(100)+1;
			}
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[0].length;j++)
			{
				if(arr[i][j] % 5 == 0)
				{
					System.out.print(arr[i][j] +" ");
				}			
			}
			System.out.println();
		}
	}
	public void exercise2() {
		Random rnd = new Random();
		int[][] arr = new int[3][4];
		
		for(int i = 0; i<arr.length; i++)
		{
			int sum = 0;
			for(int j = 0; j<arr[0].length-1; j++)
			{
				arr[i][j]=rnd.nextInt(100)+1;
				sum +=arr[i][j];
			}
			arr[i][3] = sum;
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[0].length;j++)
			{
				System.out.print(arr[i][j] +" ");		
			}
			System.out.println();
		}
	}

}
