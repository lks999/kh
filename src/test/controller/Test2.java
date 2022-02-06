package test.controller;

public class Test2 {
	public static void main(String[] args) {
		
		for(int i = 3; i <= 9; i+=2)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}
