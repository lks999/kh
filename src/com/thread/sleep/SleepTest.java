package com.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.sendAphorism();
	}
	
	public void sendAphorism() {
		String[] str = new String[10];
		
		str[0] = ("늦었다고 생각할 때가 진짜 너무 늦었다."); 
		str[1] = ("내일 할 수 있는 일을 굳이 지금할 필요가 없다."); 
		str[2] = ("들키지 않은 가라는 진짜다.");
		str[3] = ("피라미드는 사람이 만든게 맞다."); 
		str[4] = ("나쁜 짓을 한 친구보다 걸린 친구가 더 나쁘다."); 
		str[5] = ("가는 말이 고우면 얕본다.");
		str[6] = ("잠을 자도 피로가 안풀린다."); 
		str[7] = ("피할 수 없어도 피해라."); 
		str[8] = ("이 친구가 하겠습니다!, 저 친구가 할겁니다!");
		str[9] = ("늦은 결정은 택배만 지연시킬 뿐이다.");
		
		for(int i = 0; i < str.length; i++)
		{
			int n = (int) (Math.random() * 10);
			try 
			{
				System.out.println(str[n]);
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("종료");
		
	}
}
