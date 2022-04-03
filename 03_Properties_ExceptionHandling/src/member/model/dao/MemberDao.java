package member.model.dao;

import static common.JdbcTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import member.model.exception.MemberException;
import member.model.vo.Member;

public class MemberDao {
	
	Properties prop = new Properties();
	
	public MemberDao() {
		// member-query.properties의 내용 불러오기
		try 
		{
			prop.load(new FileReader("resources/member-query.properties"));
			System.out.println("> member-query.properties 로드 완료!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public int insertMember(Connection conn, Member member) {
		// 1. PreparedStatement 생성 (미완성 sql & 값대입)
		String sql = prop.getProperty("insertMember");
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
	
	public Member selectOne(Connection conn, String id) {
		String sql = prop.getProperty("selectOne");
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
				member = new Member(id, name, gender, birthday, email, address, regDate, null);
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

	public List<Member> findMemberByName(Connection conn, String name) {
		String sql = prop.getProperty("findMemberByName");
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
		String sql = prop.getProperty("selectAll");
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
				Member member = new Member(id, name, gender, birthday, email, address, regDate, null);
				list.add(member);
			}
		} 
		catch (SQLException e) 
		{
			throw new MemberException("selectAll 조회오류", e);
		}
		finally
		{
//			5. 자원반납(pstmt, rset)
			close(rset);
			close(pstmt);
		}
		 
		return list;
	}

	public int deleteMember(Connection conn, String id) {
		String sql = prop.getProperty("deleteMember");
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
		String sql = prop.getProperty("updateName");
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
			throw new MemberException("updateMember 예외",e);
		}
		finally
		{
			// 3. 자원반납(pstmt) - conn 반환하지마세요(트랜잭션 처리전입니다.)
			close(pstmt);
		}
		
		return result;
	}

	public int updateAddress(Connection conn, Member member) {
		String sql = prop.getProperty("updateAddress");
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
		String sql = prop.getProperty("updateEmail");
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
		String sql = prop.getProperty("updateBirthday");
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

	public List<Member> selectDeleteAll(Connection conn) {
		String sql = prop.getProperty("selectDeleteAll");
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
				Date sysdate = rset.getDate("del_date");
				Member member = new Member(id, name, gender, birthday, email, address, regDate, sysdate);
				list.add(member);
			}
		} 
		catch (SQLException e) 
		{
			throw new MemberException("selectAll 조회오류", e);
		}
		finally
		{
//			5. 자원반납(pstmt, rset)
			close(rset);
			close(pstmt);
		}
		 
		return list;
	}
	

}
