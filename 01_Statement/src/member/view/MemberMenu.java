package member.view;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import member.controller.MemberController;
import member.model.vo.Member;

/**
 *
 * view패키지 클래스
 * - 사용자가 보게될 화면을 담당하는 클래스
 * - 메뉴, 사용자입력값처리, 요청한 데이터 출력
 *
 */
public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController controller = new MemberController();

	public void mainMenu() {
		String menu = "===== 회원관리 =====\n"
					+ "1. 회원 전체 조회\n"
					+ "2. 회원 아이디 조회\n"
					+ "3. 회원 이름 검색\n"
					+ "4. 회원 가입\n"
					+ "5. 회원 정보 변경\n"
					+ "6. 회원 탈퇴\n"
					+ "0. 프로그램 종료\n"
					+ "------------------\n"
					+ "선택 : ";
		
		while(true)
		{
			System.out.print(menu);
			String choice = sc.next();
			List<Member> list = null;
			Member newMember = null;
			int result = 0;
			
			String id = null;
			Member member = null;
			
			String name = null;
			Member nameMember = null;
			
			String deleteId = null;
			int deleteResult = 0;
			
			Member updateMember = null;
			int updateResult = 0;
			
			switch(choice)
			{
			case "1" : 
				list = controller.selectAll();
				printMemberList(list);
				break;
				
			case "2" : 
				id = inputId();
				member = controller.selectOne(id);
				printMember(member);
				break;
				
			case "3" : 
				name = inputName();
				nameMember = controller.selectName(name);
				printNameMember(nameMember);
				break;
				
			case "4" : 
				newMember = inputMember();
				result = controller.insertMember(newMember);
				System.out.println(result > 0 ? "회원 가입 성공!" : "회원 가입 실패!");
				break;
				
			case "5" : 
				id = inputId();
				updateMember = controller.selectOne(id);
				if(updateMember == null) {
					System.out.println("조회된 회원이 없습니다.");
					continue;
				}
				else {
					updateMember = inputUpdate(updateMember);
					updateResult = controller.updateMember(updateMember);					
					System.out.println(result > 0 ? "변경 실패" : "변경 성공");
				}
				break;	
				
			case "6" : 
				deleteId = inputDelete();
				deleteResult = controller.deleteMember(deleteId);
				System.out.println(result > 0 ? "탈퇴 실패." : "탈퇴 성공.");
				break;
				
			case "0" : return;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	

	private Member inputUpdate(Member updateMember) {
		System.out.println("---- 회원 정보 변경 ----");
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("생일(예:19990909) : ");
		String _birthday = sc.next();
		Date birthday = null;
		
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			birthday = new Date(sdf.parse(_birthday).getTime()); // java.util.Date -> java.sql.Date
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		System.out.print("이메일 : ");
		String email = sc.next();
		sc.nextLine(); // 개행문자 날리기
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		return new Member(updateMember.getId(), name, null, birthday, email, address, null);
		
	}


	private String inputDelete() {
		System.out.println("---- 삭제할 대상의 id 입력 ----");
		System.out.print("id : ");
		return sc.next();
	}

	private void printNameMember(Member nameMember) {
		if(nameMember == null)
		{
			System.out.println("> 조회된 회원이 업습니다.");
		}
		else
		{
			System.out.println("====================================");
			System.out.printf("id : %s%n", nameMember.getId());
			System.out.printf("name : %s%n", nameMember.getName());
			System.out.printf("gender : %s%n", nameMember.getGender());
			System.out.printf("birthday : %s%n", nameMember.getBirthday());
			System.out.printf("email : %s%n", nameMember.getEmail());
			System.out.printf("address : %s%n", nameMember.getAddress());
			System.out.printf("regDate : %s%n", nameMember.getRegDate());
			System.out.println("------------------------------------");
			System.out.println();
		}
	}

	private String inputName() {
		System.out.println("---- 조회할 이름 입력 ----");
		System.out.print("이름 : ");
		return sc.next();
	}

	/**
	 * 회원 1명 출력 메소드
	 * - null
	 * - member 1개
	 * @param member
	 */
	private void printMember(Member member) {
		if(member == null)
		{
			System.out.println("> 조회된 회원이 업습니다.");
		}
		else
		{
			System.out.println("====================================");
			System.out.printf("id : %s%n", member.getId());
			System.out.printf("name : %s%n", member.getName());
			System.out.printf("gender : %s%n", member.getGender());
			System.out.printf("birthday : %s%n", member.getBirthday());
			System.out.printf("email : %s%n", member.getEmail());
			System.out.printf("address : %s%n", member.getAddress());
			System.out.printf("regDate : %s%n", member.getRegDate());
			System.out.println("------------------------------------");
			System.out.println();
		}
	}
	/**
	 * 조회할 id를 입력하는 메소드
	 * @return
	 */
	private String inputId() {
		System.out.println("---- 조회할 id 입력 ----");
		System.out.print("id : ");
		return sc.next();
	}
	/**
	 * 여러행 조회결과 출력 메소드
	 * (list가 null인 경우 없음)
	 * - 0행
	 * - n행
	 * @param list
	 */
	public void printMemberList(List<Member> list) {
		if(list.isEmpty())
		{
			System.out.println("> 조회된 행이 없습니다.");
		}
		else
		{
			System.out.println("> 조회결과");
			System.out.println("====================================================");
			System.out.printf("%15s%15s%15s%15s%15s%15s%15s%n", "id", "name", "gender", "birthday", "email", "address", "regDate");
			System.out.println("----------------------------------------------------");
			for(Member member : list)
			{
				System.out.printf("%15s%15s%15s%15s%15s%15s%15s%n", member.getId(), member.getName(), member.getGender(), member.getBirthday(), member.getEmail(), member.getAddress(), member.getRegDate());
			}
			System.out.println("----------------------------------------------------");
		}
	}

	/**
	 * 사용자입력값으로 member객체 생성
	 * 
	 */
	private Member inputMember() {
		System.out.println("----- 새 회원 정보 입력 -----");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별(M/F) : ");
		String gender = String.valueOf(sc.next().toUpperCase().charAt(0));
		System.out.print("생일(예:19990909) : ");
		String _birthday = sc.next();
		Date birthday = null;
		
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			birthday = new Date(sdf.parse(_birthday).getTime()); // java.util.Date -> java.sql.Date
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		System.out.print("이메일 : ");
		String email = sc.next();
		sc.nextLine(); // 개행문자 날리기
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		 return new Member(id, name, gender, birthday, email, address, null);
	}

}
