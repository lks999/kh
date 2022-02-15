package member.controller;

import member.model.vo.Member;

public class MemberManager {

	Member[] member = new Member[40];
	private int index = 0;
	
	public void insertMember(Member m) {
		member[index++] = m;
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
