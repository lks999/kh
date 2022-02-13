package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	private static final int LENGTH = 10;
	private Silver[] silvers = new Silver[LENGTH];
	private Gold[] golds = new Gold[LENGTH];
	private Vip[] vips = new Vip[LENGTH];
	private VVip[] vvips = new VVip[LENGTH];
	
	private int silverIndex = 0;
	private int goldIndex = 0;
	private int vipIndex = 0;
	private int vvipIndex = 0;
	
	public void silverInsert(Silver silver) {
		silvers[silverIndex++] = silver;
		
	}
	
	public void goldInsert(Gold gold) {
		golds[goldIndex++] = gold;
		
	}
	
	public void vipInsert(Vip vip) {
		vips[vipIndex++] = vip;
	}
	
	public void vvipInsert(VVip vvip) {
		vvips[vvipIndex++] = vvip;
	}
	
	public void printData() {
		
		System.out.println("---------------------------<<회원정보>>---------------------------");
		System.out.println("이름              등급              포인트             이자포인트");
		System.out.println("-----------------------------------------------------------------");
		
		for(int i = 0; i < silverIndex; i++)
		{
			System.out.printf("%s            %s            %d             %.2f\n",silvers[i].getName(), silvers[i].getGrade(), silvers[i].getPoint(), silvers[i].getInterest());
		}
		
		for(int i = 0; i < goldIndex; i++)
		{
			System.out.printf("%s            %s              %d             %.2f\n",golds[i].getName(), golds[i].getGrade(), golds[i].getPoint(), golds[i].getInterest());
		}
		
		System.out.println("---------------------------<<VIP>>---------------------------");
		
		for(int i = 0; i < vipIndex; i++)
		{
			System.out.printf("%s            %s              %d             %.2f\n",vips[i].getName(), vips[i].getGrade(), vips[i].getPoint(), vips[i].getInterest());
		}
		
		System.out.println("---------------------------<<VVIP>>---------------------------");
		
		for(int i = 0; i < vvipIndex; i++)
		{
			System.out.printf("%s            %s              %d             %.2f\n",vvips[i].getName(), vvips[i].getGrade(), vvips[i].getPoint(), vvips[i].getInterest());
		}
		
	}

}
