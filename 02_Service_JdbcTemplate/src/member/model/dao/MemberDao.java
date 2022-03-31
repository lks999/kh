package member.model.dao;

import static common.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import member.model.vo.Member;

public class MemberDao {

	public int insertMember(Connection conn, Member member) {
		// 1. PreparedStatement 생성 (미완성 sql & 값대입)
		String sql = "insert into member values(?, ?, ?, ?, ?, ?, default)";
		int result = 0;
		PreparedStatement pstmt = null;
	
		try 
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getGender());
			pstmt.setDate(4, member.getBirthday());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getAddress());
			
			// 2. 실행
			result = pstmt.executeUpdate();
		} 
		
		catch (SQLException e) 
		{
			// 체크드예외를 언체크드예외로 전환해서 던지기
			throw new RuntimeException(e); // 원래 발생한 예외를 감싸서(전환) 다시 던지기 -> service 트랜잭션처리용
		}
		finally
		{
			// 3. 자원반납(pstmt) - conn 반환하지마세요(트랜잭션 처리전입니다.)
			close(pstmt);
		}
		return result;
	}

	public List<Member> findMemberByName(Connection conn, String name) {
		String sql = "select * from member where name like ?";
		List<Member> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try 
		{
			// 1. PreparedStatement 생성 (미완성 sql & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ name +"%");
			
			// 2. 실행
			rset = pstmt.executeQuery();
			
			// 3. ResultSet처리 -> Member객체 변환
			while(rset.next())
			{
				Member member = new Member();
				member.setId(rset.getString("id"));
				member.setName(rset.getString("name"));
				member.setGender(rset.getString("gender"));
				member.setBirthday(rset.getDate("birthday"));
				member.setEmail(rset.getString("email"));
				member.setAddress(rset.getString("address"));
				member.setRegDate(rset.getTimestamp("reg_date"));
				
				list.add(member);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			// 4. 자원반납
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public List<Member> selectAll(Connection conn) {
		String sql = "select * from member";
		List<Member> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		
		try 
		{
//			3. PreparedStatement 객체 생성(미완성 sql 값대입)
			pstmt = conn.prepareStatement(sql);
//			4. 실행 (및 ResultSet처리)
			rset = pstmt.executeQuery();
			
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
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
//			5. 자원반납(pstmt, rset)
			close(rset);
			close(pstmt);
		}
		 
		return list;
	}

	public Member selectOne(Connection conn, String id) {
		String sql = "select * from member where id = ?";
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		
		try 
		{
			// 1. PreparedStatement 생성 (미완성 sql & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			// 2. 실행
			rset = pstmt.executeQuery();
			
			// 3. ResultSet처리 -> Member객체 변환
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

		// 4. 자원반납
		finally
		{
			close(rset);
			close(pstmt);
		}
		return member;
	}

	public int deleteMember(Connection conn, String id) {
		String sql = "delete from member where id = ?";
		int result = 0;
		PreparedStatement pstmt = null;
		
		try 
		{
			// 1. PreparedStatement 생성 (미완성 sql & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			// 2. 실행
			result = pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
		finally
		{
			// 3. 자원반납(pstmt) - conn 반환하지마세요(트랜잭션 처리전입니다.)
			close(pstmt);
		}
		
		return result;
	}

	public int updateName(Connection conn, Member member) {
		String sql = "update member set name = ? where id = ?";
		int result = 0;
		PreparedStatement pstmt = null;
		
		try 
		{
			// 1. PreparedStatement 생성 (미완성 sql & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getId());
			
			// 2. 실행
			result = pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
		finally
		{
			// 3. 자원반납(pstmt) - conn 반환하지마세요(트랜잭션 처리전입니다.)
			close(pstmt);
		}
		
		return result;
	}

	public int updateAddress(Connection conn, Member member) {
		String sql = "update member set address = ? where id = ?";
		int result = 0;
		PreparedStatement pstmt = null;
		
		try 
		{
			// 1. PreparedStatement 생성 (미완성 sql & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getAddress());
			pstmt.setString(2, member.getId());
			
			// 2. 실행
			result = pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
		finally
		{
			// 3. 자원반납(pstmt) - conn 반환하지마세요(트랜잭션 처리전입니다.)
			close(pstmt);
		}
		
		return result;
	}

	public int updateEmail(Connection conn, Member member) {
		String sql = "update member set email = ? where id = ?";
		int result = 0;
		PreparedStatement pstmt = null;
		
		try 
		{
			// 1. PreparedStatement 생성 (미완성 sql & 값대입)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getId());
			
			// 2. 실행
			result = pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
		finally
		{
			// 3. 자원반납(pstmt) - conn 반환하지마세요(트랜잭션 처리전입니다.)
			close(pstmt);
		}
		
		return result;
	}

	public int updateBirthday(Connection conn, Member member) {
		String sql = "update member set birthday = ? where id = ?";
		int result = 0;
		PreparedStatement pstmt = null;
		
		// 1. PreparedStatement 생성 (미완성 sql & 값대입)
		try 
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, member.getBirthday());
			pstmt.setString(2, member.getId());
			
			// 2. 실행
			result = pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
		finally
		{
			// 3. 자원반납(pstmt) - conn 반환하지마세요(트랜잭션 처리전입니다.)
			close(pstmt);
		}
		
		return result;
	}
	

}
