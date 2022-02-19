package com.api.member.run;

import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {
	
	public static void main(String[] args) {
		
		String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";			
				
		StringTokenizer tokenizer = new StringTokenizer(data, "|");
		Member[] member = new Member[tokenizer.countTokens()];
		int cnt = 0;
		
		while(tokenizer.hasMoreTokens())
		{
			String token = tokenizer.nextToken();
			String[] result = token.split(",");
			
			Member member2 = new Member();
			
			member2.setMemberNo(Integer.parseInt(result[0]));
			member2.setMemberName(result[1]);
			member2.setHeight(Integer.parseInt(result[2]));
			member2.setWeight(Integer.parseInt(result[3]));
			
			int year = Integer.parseInt(result[4].substring(0, 4));
			int month = Integer.parseInt(result[4].substring(4, 6));
			int day = Integer.parseInt(result[4].substring(6, 8));
			member2.setBirth(new GregorianCalendar(year, month, day));
			
			member[cnt++] = member2;
		}
		
		for(int i = 0; i<cnt; i++)
		{
			Member m = member[i];
			System.out.println(m.information());
		}
	}
}
