package ncs.test5;

import java.util.Scanner;

public class TestScore {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 3;
		int count2 = 3;
		
		double[][] a = new double[count][count2 + 2];
		
		for(int i = 0; i<a.length;i++)
		{
			System.out.println("학생" + i +" 점수 입력");
			double sum = 0.0;
			for(int j = 0; j < a[i].length; j++) 
			{
				if(j < count2) 
				{
					System.out.print("과목" + (j + 1) + " 점수 입력 : ");
					a[i][j] = sc.nextDouble();
					sum += a[i][j];
				}
				else if(j == count2) 
				{
					a[i][j] = sum; 
				}
				else 
				{
					a[i][j] = sum / count2;
				}
			}
		}
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(i);
			for(int j = 0; j < a[i].length;j++) 
			{
				System.out.printf("\t%.1f", a[i][j]);
			}
			System.out.println();
		}
	}
}
