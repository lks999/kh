package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();
		
		System.out.print("첫 번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int b = sc.nextInt();
		
		int sum = calc.sum(a, b);
		int sub = calc.subtract(a, b);
		int mul = calc.multiply(a, b);
		int div = calc.divide(a, b);
		
		System.out.println("합:" + sum);
		System.out.println("차:" + sub);
		System.out.println("곱:" + mul);
		System.out.println("나누기:" + div);

	}

}
