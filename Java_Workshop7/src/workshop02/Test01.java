package workshop02;

import java.util.Scanner;

public class Test01 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int[] intarr = new int[3];
			
			System.out.print("3개의 정수 입력 : ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
			intarr[0] = n1;
			intarr[1] = n2;
			intarr[2] = n3;
			
			
			System.out.printf("입력 값 : %d %d %d\n",n1, n2, n3);
			
			int max = intarr[0];
			int min = intarr[0];
			
			for(int i = 1; i < intarr.length; i++)
			{ 
				if(min > intarr[i]) 
				{ 
					min = intarr[i]; 
				} 
				if(max < intarr[i]) 
				{ 
					max = intarr[i]; 
				} 
			}	
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
		}
}
