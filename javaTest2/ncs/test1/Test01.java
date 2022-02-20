package ncs.test1;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서별 점수 5개를 입력하세요 : ");
		String n = sc.nextLine();
		
		String[] num = n.split(" ");
		
		if(num.length != 5)
		{
			System.out.println("다시 입력 하세요");
			return;
		}
		
		double a = Integer.parseInt(num[0]);
		double b = Integer.parseInt(num[1]);
		double c = Integer.parseInt(num[2]);
		double d = Integer.parseInt(num[3]);
		double e = Integer.parseInt(num[4]);
		
		if((num.length < 5) || (a < 10 || a > 99) || (b < 10 || b > 99) || (c < 10 || c > 99)
				|| (d < 10 || d > 99) || (e < 10 || e > 99))
		{
			System.out.println("다시 입력 하세요");
		}
		else
		{
			double result = ((a + b) / 2 * 0.6) + ((c + d) / 2 * 0.2) + (e * 0.2);
			
			if(result>=90)
			{
				System.out.printf("평가점수 %.1f점\n",result);
				System.out.print("Class: Gold Class");
			}		
			else if(result>=80)
			{
				System.out.printf("평가점수 %.1f점\n",result);
				System.out.print("Class: Gold Class");
			}	
			else if(result>=70)
			{
				System.out.printf("평가점수 %.1f점\n",result);
				System.out.print("Class: Gold Class");
			}		
			else
			{
				System.out.printf("평가점수 %.1f점\n",result);
				System.out.print("Class: Gold Class");
			}	
		}
			
	}

}
