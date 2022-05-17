package member.model.service;

import static common.JdbcTemplate.*;
import java.sql.Connection;

import member.model.dao.MemberDao;
import member.model.dto.Member;

/**
 * 
 * 1. connection생성
 * 2. dao 요청(connection)
 * 3. dml경우 transaction처리
 * 4. connection반환
 * 5. controller로 값 반환처리
 *
 */
public class MemberService {
	
	private MemberDao memberDao = new MemberDao();

	public Member findByMemberId(String memberId) {
		Connection conn = getConnection();
		Member member = memberDao.findByMemberId(conn, memberId);
		close(conn);
		return member;
	}
	
	public int insertMember(Member member) {
		int result = 0;
		Connection conn = getConnection();
		try
		{
			result = memberDao.insertMember(conn, member);
			commit(conn);
		}
		catch(Exception e)
		{
			rollback(conn);
			throw e; //controller에게 통보용
		}
		finally
		{			
			close(conn);
		}
		return result;
	}

	public int updateMember(Member member) {
		int result = 0;
		// conn 생성
		Connection conn = getConnection();
		// dao에 요청
		try
		{
			result = memberDao.updateMember(conn, member);
			commit(conn);
		}
		catch(Exception e)
		{
			rollback(conn);
			throw e;
		}
		finally
		{
			close(conn);
		}
		return result;
	}

	public int DeleteMember(String loginMember) {
		int result = 0;
		Connection conn = getConnection();
		try
		{
			result = memberDao.DeleteMember(conn, loginMember);
			commit(conn);
		}
		catch(Exception e)
		{
			rollback(conn);
		}
		finally
		{
			close(conn);
		}
		return result;
	}

}
