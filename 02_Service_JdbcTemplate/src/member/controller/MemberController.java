package member.controller;

import java.util.List;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * controller클래스
 * - service단 업무요청 
 *
 *
 */
public class MemberController {
	
	private MemberService memberService = new MemberService();

	public int insertMember(Member member) {
		int result = memberService.insertMember(member);
		return result;
	}

	public List<Member> findMemberByName(String name) {
		List<Member> list = memberService.findMemberByName(name);
		return list;
	}

	public List<Member> selectAll() {
		List<Member> list = memberService.selectAll();
		return list;
	}

	public Member selectOne(String id) {
		Member member = memberService.selectOne(id);
		return member;
	}

	public int deleteMember(String id) {
		int result = memberService.deleteMember(id);
		return result;
	}

	public int updateName(Member member) {
		int result = memberService.updateName(member);
		return result;
	}

	public int updateAddress(Member member) {
		int result = memberService.updateAddress(member);
		return result;
	}

	public int updateEmail(Member member) {
		int result = memberService.updateEmail(member);
		return result;
	}

	public int updateBirthday(Member member) {
		int result = memberService.updateBirthday(member);
		return result;
	}

}
