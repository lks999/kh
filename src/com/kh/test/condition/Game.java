package com.kh.test.condition;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Game main = new Game();
		main.test();
	}
	
	public void test() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("===가위 바위 보 게임===");
		System.out.print("숫자를 선택하세요(1.가위 2.바위 3.보) : ");
		int userCoin = sc.nextInt();
		int comCoin = rnd.nextInt(3) + 1;
		
		if(userCoin == 1 && comCoin == 1)
		{
			System.out.println("========결과========");
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("===================");
			System.out.println("비겼습니다.");
		}
		else if(userCoin == 1 && comCoin == 2)
		{
			System.out.println("========결과========");
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("===================");
			System.out.println("당신이 졌습니다.");
		}
		else if(userCoin == 1 && comCoin == 3)
		{
			System.out.println("========결과========");
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("===================");
			System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
		}
		else if(userCoin == 2 && comCoin == 1)
		{
			System.out.println("========결과========");
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("===================");
			System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
		}
		else if(userCoin == 2 && comCoin == 2)
		{
			System.out.println("========결과========");
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("===================");
			System.out.println("비겼습니다.");
		}
		else if(userCoin == 2 && comCoin == 3)
		{
			System.out.println("========결과========");
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("===================");
			System.out.println("당신이 졌습니다.");
		}
		else if(userCoin == 3 && comCoin == 1)
		{
			System.out.println("========결과========");
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("===================");
			System.out.println("당신이 졌습니다.");
		}
		else if(userCoin == 3 && comCoin == 2)
		{
			System.out.println("========결과========");
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("===================");
			System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
		}
		else if(userCoin == 3 && comCoin == 3)
		{
			System.out.println("========결과========");
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("===================");
			System.out.println("비겼습니다.");
		}
		else
		{
			System.out.println("가위바위보만 내주세요");
		}
	}

}
