package member.model.service;

import static common.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;

import member.model.dao.MemberDao;
import member.model.vo.Member;

/**
 * service 클래스
 *
 * ------------------------------------------------- Service 시작
 * 1. 드라이버클래스 등록
 * 2. Connection객체 생성 (setAutoCommit(false))
 * ------------------------------------------------- Dao 시작
 * 		3. PreparedStatement 객체 생성(미완성 sql 값대입)
 * 		4. 실행 (및 ResultSet처리)
 * 		5. 자원반납(pstmt, rset)
 * ------------------------------------------------- Dao 끝
 * 6. 트랜잭션처리
 * 7. 자원반납 (conn)
 * ------------------------------------------------- Service 끝
 *
 */
public class MemberService {
	
	private MemberDao memberDao = new MemberDao();
	
	public int insertMember(Member member) {
		int result = 0;
		// 1. Connection 생성
		Connection conn = getconnection();

		try 
		{
			// 2. dao 요청
			result = memberDao.insertMember(conn, member);
			// 3. 트랜잭션처리
			commit(conn);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			rollback(conn);
		}
		finally
		{
			// 4. 자원반납
			close(conn);
		}

		return result;
	}

	public List<Member> findMemberByName(String name) {
		// 1. Connection 생성
		Connection conn = getconnection();
		// 2. dao 요청
		List<Member> list = memberDao.findMemberByName(conn, name);
		// 3. 자원 반납
		close(conn);
		return list;
	}

	public List<Member> selectAll() {
		// 1. Connection 생성
		Connection conn = getconnection();
		// 2. dao 요청
		List<Member> list = memberDao.selectAll(conn);
		// 3. 자원 반납
		close(conn);
		return list;
	}

	public Member selectOne(String id) {
		// 1. Connection 생성
		Connection conn = getconnection();
		
		// 2. dao 요청
		Member member = memberDao.selectOne(conn, id);
		// 3. 자원 반납
		close(conn);
		return member;
	}

	public int deleteMember(String id) {
		int result = 0;
		// 1. Connection 생성
		Connection conn = getconnection();
		
		try 
		{
			// 2. dao 요청
			result = memberDao.deleteMember(conn, id);
			// 3. 트랜잭션처리
			commit(conn);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			rollback(conn);
		}
		// 4. 자원 반납
		finally
		{
			close(conn);
		}
		return result;
	}

	public int updateName(Member member) {
		int result = 0;
		
		// 1. Connection 생성
		Connection conn = getconnection();
		
		try 
		{
			// 2. dao 요청
			result = memberDao.updateName(conn, member);
			// 3. 트랜잭션처리
			commit(conn);
					
		} 
		catch (Exception e) 
		{
			rollback(conn);
			throw e; // controller에서 분기처리할 수 있도록 다시 던짐.
		}
		finally
		{
			close(conn);
		}
		
		return result;
	}

	public int updateAddress(Member member) {
		int result = 0;
		
		// 1. Connection 생성
		Connection conn = getconnection();
		
		try 
		{
			// 2. dao 요청
			result = memberDao.updateAddress(conn, member);
			// 3. 트랜잭션처리
			commit(conn);
					
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			rollback(conn);
		}
		finally
		{
			close(conn);
		}
		
		return result;
	}

	public int updateEmail(Member member) {
		int result = 0;
		
		// 1. Connection 생성
		Connection conn = getconnection();
		
		try 
		{
			// 2. dao 요청
			result = memberDao.updateEmail(conn, member);
			// 3. 트랜잭션처리
			commit(conn);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			rollback(conn);
		}
		finally
		{
			close(conn);
		}
		
		return result;
	}

	public int updateBirthday(Member member) {
		
		int result = 0;
		// 1. Connection 생성
		Connection conn = getconnection();
		
		try 
		{
			// 2. dao 요청
			result = memberDao.updateBirthday(conn, member);
			// 3. 트랜잭션처리
			commit(conn);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			rollback(conn);
		}
		finally
		{
			close(conn);
		}
		return result;
	}

	public List<Member> selectDeleteAll() {
		// 1. Connection 생성
		Connection conn = getconnection();
		// 2. dao 요청
		List<Member> list = memberDao.selectDeleteAll(conn);
		// 3. 자원 반납
		close(conn);
		return list;
	}
	

	
//	public int insertMember(Member member) {
//		Connection conn = null;
//		int result = 0;
//		try
//		{
//			// 1. driver class 등록
//			Class.forName(driverClass);
//			
//			// 2. Connection 생성 (setAutoCommit(false))
//			conn = DriverManager.getConnection(url, user, password);
//			conn.setAutoCommit(false);
//			
//			// 3. dao 요청 및 리턴
//			result = memberDao.insertMember(conn, member);
//			
//			// 4. 트랜잭션처리
//			conn.commit();
//		} 
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//			
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//		}
//		finally
//		{
//			// 5. 자원반납
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		
//		return result;
//	}
}










