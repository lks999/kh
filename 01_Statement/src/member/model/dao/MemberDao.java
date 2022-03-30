package member.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import member.model.vo.Member;

public class MemberDao {
	
	String driverClass = "oracle.jdbc.OracleDriver"; //드라이버클래스명
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속할 db서버주소 (db접속프로토콜@ip:port:sid)
	String user = "student";
	String password = "student";
	
	/**
	 * db에 접속, 쿼리를 실행하는 메소드
	 * 
	 * @param newMember
	 * @return
	 */
	public int insertMember(Member newMember) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
//		String sql = "insert into member values('yoogs', '1234', '유관순', 'F', to_date('19990909'), 'yoogs@gmail.com', '서울시 강남구', default)";
		String sql = "insert into member values(?, ?, ?, ?, ?, ?, default)"; // 미완성 sql문
		
		
		try 
		{
			// 1. driver class 등록
			Class.forName(driverClass);
			
			// 2. Connection 객체 생성(setAutoCommiot(false))
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			
			// 3. PreparedStatement 객체 생성(미완성 sql전달 & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newMember.getId());
			pstmt.setString(2, newMember.getName());
			pstmt.setString(3, newMember.getGender());
			pstmt.setDate(4, newMember.getBirthday());
			pstmt.setString(5, newMember.getEmail());
			pstmt.setString(6, newMember.getAddress());
			
			// 4. Statement 실행 및 int(처리행수) 반환
			result = pstmt.executeUpdate();
			
			// 5.1 트랜잭션처리
			conn.commit();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			// 5.2 트랜잭션처리
			try 
			{
				conn.rollback();
			} 
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
		}
		finally
		{
			// 6. 자원반납
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	/**
	 * member테이블의 모든 행을 리턴하는 메소드
	 * @return
	 */
	public List<Member> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select * from member order by reg_date desc";
		List<Member> list = new ArrayList<>();
		
		try 
		{
			// 1. driver class 등록
			Class.forName(driverClass);
			
			// 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. PreparedStatement 객체 생성(미완성 sql전달 & 값대입)
			pstmt = conn.prepareStatement(sql);
			
			// 4. PreparedStatement 실행 및 ResultSet 반환
			rset = pstmt.executeQuery();
			// 5. ResultSet 한행씩 fetch. Member객체 전환 후 list에 추가
			// 한행씩 접근
			while(rset.next())
			{
				String id = rset.getString("id");
				String name = rset.getString("name");
				String gender = rset.getString("gender");
				Date birthday = rset.getDate("birthday");
				String email = rset.getString("email");
				String address = rset.getString("address");
				Timestamp regDate = rset.getTimestamp("reg_date");
				Member member = new Member(id, name, gender, birthday, email, address, regDate);
				list.add(member);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			// 6. 자원 반납
			try {
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public Member selectOne(String id) {
		String sql = "select * from member where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member member = null;
		
		
		try 
		{
			// 1. driver class 등록
			Class.forName(driverClass);
			
	        // 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			
	        // 3. PreparedStatement 객체 생성(미완성 sql전달 & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
	        // 4. PreparedStatement 실행 및 ResultSet 반환
			rset = pstmt.executeQuery();
			
	        // 5. ResultSet 한행씩 fetch. Member객체 전환 후 list에 추가
			while(rset.next())
			{
				String name = rset.getString("name");
				String gender = rset.getString("gender");
				Date birthday = rset.getDate("birthday");
				String email = rset.getString("email");
				String address = rset.getString("address");
				Timestamp regDate = rset.getTimestamp("reg_date");
				member = new Member(id, name, gender, birthday, email, address, regDate);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		
		finally
		{
			// 6. 자원반납
			try {
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		return member;
	}

	public Member selectName(String name) {
		String sql = "select * from member where name like ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member member = null;
		
       
		try 
		{
			// 1. driver class 등록
			Class.forName(driverClass);
			
	        // 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
	        // 3. PreparedStatement 객체 생성(미완성 sql전달 & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");
			
	        // 4. PreparedStatement 실행 및 ResultSet 반환
			rset = pstmt.executeQuery();
			
	        // 5. ResultSet 한행씩 fetch. Member객체 전환 후 list에 추가
			while(rset.next())
			{
				String id = rset.getString("id");
				String gender = rset.getString("gender");
				Date birthday = rset.getDate("birthday");
				String email = rset.getString("email");
				String address = rset.getString("address");
				Timestamp regDate = rset.getTimestamp("reg_date");
				member = new Member(id, name, gender, birthday, email, address, regDate);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			// 6. 자원반납
			try {
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

        
		return member;
	}

	public int deleteMember(String deleteId) {
		String sql = "delete from member where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try 
		{
			// 1. driver class 등록
			Class.forName(driverClass);
			
			// 2. Connection 객체 생성(setAutoCommit(false))
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			
			// 3. PreparedStatement 객체 생성(미완성 sql전달 & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deleteId);
			
			// 4. Statement실행 및 int(처리행수) 반환
			result = pstmt.executeUpdate();
			
			// 5. 트랜잭션처리
			conn.commit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			// 6. 자원반납
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		return result;
	}

	public int updateMember(Member updateMember) {
		String sql = "update member set name = ?, birthday = ?, email = ?, address = ? where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		
		try 
		{
			// 1. driver class 등록
			Class.forName(driverClass);
			
			// 2. Connection 객체 생성(setAutoCommit(false))
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			
			// 3. PreparedStatement 객체 생성(미완성 sql전달 & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updateMember.getName());
			pstmt.setDate(2, updateMember.getBirthday());
			pstmt.setString(3, updateMember.getEmail());
			pstmt.setString(4, updateMember.getAddress());
			pstmt.setString(5, updateMember.getId());
			
			// 4. Statement실행 및 int(처리행수) 반환
			result = pstmt.executeUpdate();
			
			// 5. 트랜잭션처리
			conn.commit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			// 6. 자원반납
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}







