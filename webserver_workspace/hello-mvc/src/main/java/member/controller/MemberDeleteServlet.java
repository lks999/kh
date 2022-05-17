package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.dto.Member;
import member.model.service.MemberService;

/**
 * Servlet implementation class MemberDeleteServlet
 */
@WebServlet("/member/memberDelete")
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService memberService = new MemberService();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			// 1. 인코딩(필터)
//			request.setCharacterEncoding("utf-8");
			
			// 2. 사용자입력값
			HttpSession session = request.getSession(false);
			Member loginMember = (Member) session.getAttribute("loginMember");
			
			// 3. 업무로직 (db insert)
			int result = memberService.DeleteMember(loginMember.getMemberId());
			
			String msg = result > 0 ? "탈퇴되었습니다." : "탈퇴에 실패했습니다.";
			
			if(session != null)
			{
				session.invalidate();
			}
			
			// 4. 리다이렉트
			request.getSession().setAttribute("msg", msg);
			response.sendRedirect(request.getContextPath() + "/");
		}
		catch(Exception e)
		{
			// 1. 로깅 및 관리팀 알림.
			e.printStackTrace();
			// 2. 예외던지기 - tomcat에 통보
			throw e;
		}

	}

}
