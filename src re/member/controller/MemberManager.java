package member.controller;

import member.model.vo.Member;

public class MemberManager {

	Member[] member = new Member[40];
	Member[] member2 = new Member[40];
	private int index = 0;
	private int index2 = 0;
	
	public void insertMember(Member m) {
		member[index++] = m;
	}
	public void insertMember2(Member member) {
		member2[index2++] = member;
	}
	public void printBuyInfo(int price) {
		
		for(int i = 0; i < index2; i++)
		{
			System.out.printf("%s등급회원 %s은 %d원 상품을 %d원에 구매합니다.\n", 
					member2[i].getGrade(),member2[i].getName(),price,member2[i].buy(price));
		}
		
	}
	
	public void printData() {
		
		System.out.println("---------------------------<<회원정보>>---------------------------");
		System.out.println("이름              등급              포인트             이자포인트");
		System.out.println("-----------------------------------------------------------------");
		
		for(int i = 0; i < index; i++)
		{
			System.out.printf("%s            %s            %d             %.2f\n",
					member[i].getName(), member[i].getGrade(), member[i].getPoint(), member[i].getInterest());
		}

		
	}

}
