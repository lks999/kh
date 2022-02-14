package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {
	public static void main(String[] args) {
		Member member = new Member();
		
		member.setMemberId("lks999");
		member.setMemberPwd("0000000");
		member.setMemberName("이경석");
		member.setAge(27);
		member.setGender('남');
		member.setPhone("010-0000-0000");
		member.setEmail("abc@naver.com");
		
		System.out.printf("Id : %s\n", member.getMemberId());
		System.out.printf("Pwd : %s\n", member.getMemberPwd());
		System.out.printf("Name : %s\n", member.getMemberName());
		System.out.printf("age : %d\n", member.getAge());
		System.out.printf("Gender : %c\n", member.getGender());
		System.out.printf("phone number : %s\n", member.getPhone());
		System.out.printf("email : %s\n", member.getEmail());
	}

}
