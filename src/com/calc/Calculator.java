package com.calc;

public class Calculator {
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if((num1 >= 1 && num1 <=9) && (num2 >=1 && num1 <=9))
		{
			int sum = num1 + num2;
			int min = num1 - num2;
			int mul = num1 * num2;
			
			System.out.println("합 : " + sum);
			System.out.println("차 : " + min);
			System.out.println("곱 : " + mul);
			
			if(num2<=0) 
			{
				System.out.println("나누기 : 0");
			}
			else
			{
				int div = num1 / num2;
				System.out.println("나누기 : " + div);
			}
		}
	}

}
