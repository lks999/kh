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
		List<Member> list = null;;
		try 
		{
			list = memberService.selectAll();
		} 
		catch (Exception e) 
		{
			// 1. 오류로그 (개발자용)
//			e.printStackTrace();
			
			// 2. 사용자 오류 알림
			System.err.println("[" + e.getMessage() + "] 불편을 드려 죄송합니다. 관리자에게 문의하세요." );
		}
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
		int result = 0;
		try
		{
			result = memberService.updateName(member);
		}
		catch(Exception e)
		{
			// 1. 오류 로그 출력
//			e.printStackTrace();
			// 2. 사용자 통보
			System.err.println("[" + e.getMessage() + "] 불편을 드려 죄송합니다. 관리자에게 문의하세요." );
		}
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

	public List<Member> selectDeleteAll() {
		List<Member> list = null;;
		try 
		{
			list = memberService.selectDeleteAll();
		} 
		catch (Exception e) 
		{
			// 1. 오류로그 (개발자용)
//			e.printStackTrace();
			
			// 2. 사용자 오류 알림
			System.err.println("[" + e.getMessage() + "] 불편을 드려 죄송합니다. 관리자에게 문의하세요." );
		}
		return list;
	}

}
