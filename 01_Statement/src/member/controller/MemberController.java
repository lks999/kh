package member.controller;

import java.util.List;

import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberController {
	
	private MemberDao memberDao = new MemberDao();
	/**
	 * 사용자의 회원가입 요청을 처리하는 메소드
	 * 1. dao에 회원가입 요청 후 int반환
	 * 2. menu에 int반환
	 */
	
	public int insertMember(Member newMember) {
		int result = memberDao.insertMember(newMember);
		System.out.println("result@MemberController = " + result);
		return result;
	}
	public List<Member> selectAll() {
		List<Member> list = memberDao.selectAll();
		return list;
	}
	public Member selectOne(String id) {
		Member member = memberDao.selectOne(id);
		return member;
	}
	public Member selectName(String name) {
		Member member = memberDao.selectName(name);
		return member;
	}
	public int deleteMember(String deleteId) {
		int deleteResult = memberDao.deleteMember(deleteId);
		System.out.println("result@MemberController = " + deleteResult);
		return deleteResult;
	}
	public int updateMember(Member updateMember) {
		int updateResult = memberDao.updateMember(updateMember);
		System.out.println("result@MemberController = " + updateResult);
		return updateResult;
	}

}
