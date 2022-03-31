package member.view;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import member.controller.MemberController;
import member.model.vo.Member;

/**
 * view단 클래스
 * - 메뉴노출, 사용자입력값처리, 결과값출력
 *
 */
public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController memberController =  new MemberController();
	
	
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
		while(true) {
			System.out.print(menu);
			String choice = sc.next();
			
			Member member = null;
			int result = 0;
			
			String name = null;
			List<Member> list = null;
			
			String id = null;
			
			switch(choice)
			{
			case "1" : 
				list = memberController.selectAll();
				printMemberList(list);
				break;
			
			case "2" : 
				id = inputId();
				member = memberController.selectOne(id);
				printMember(member);
				break;
			
			case "3" : 
				name = inputMemberName();
				list = memberController.findMemberByName(name);
				printMemberList(list);
				break;
			
			case "4" : 
				member = inputMember();
				result = memberController.insertMember(member);
				printResultMsg(result, "회원 가입 성공!", "회원 가입 실패!");
				break;
				
			case "5" : 
				id = updateId();
				member = memberController.selectOne(id);
				
				if(member == null)
				{
					System.out.println("없는 회원 입니다.");
				}
				else
				{
					printMember(member);
					updateMenu(member);
				}
				break;
			
			case "6" : 
				id = deleteId();
				result = memberController.deleteMember(id);
				printResultMsg(result, "회원 삭제 성공!", "회원 삭제 실패!");
				break;
			case "0" : return;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	

	private void updateMenu(Member member) {
		String menu = "===== 변경메뉴 =====\n"
                + "1. 이름 변경\n"
                + "2. 생일 변경\n"
                + "3. 이메일 변경\n"
                + "4. 주소 변경\n"
                + "9. 메인메뉴 돌아가기\n"
                + "------------------\n"
                + "선택 : ";
		while(true)
		{
			System.out.print(menu);
			String choice = sc.next();
			int result = 0;
			
			switch(choice)
			{
			case "1" : 
				System.out.println("> 변경할 이름을 입력하세요");
				System.out.print("> 이름 : ");
				member.setName(sc.next());
				result = memberController.updateName(member);
				printResultMsg(result, "이름 변경 성공!", "이름 변경 실패!");
				break;
				
			case "2" : 
				System.out.println("> 변경할 생일을 입력하세요");
				System.out.print("> 생일(예:19990314) : ");
				String _birthday = sc.next();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Date birthday = null;
				
				try 
				{
					long millis = sdf.parse(_birthday).getTime();
					birthday = new Date(millis);
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}
				member.setBirthday(birthday);
				result = memberController.updateBirthday(member);
				printResultMsg(result, "생일 변경 성공!", "생일 변경 실패!");
				break;
				
			case "3" : 
				System.out.println("> 변경할 이메일을 입력하세요");
				System.out.print("> 이메일 : ");
				member.setEmail(sc.next());
				result = memberController.updateEmail(member);
				printResultMsg(result, "이메일 변경 성공!", "이메일 변경 실패!");
				break;
				
			case "4" : 
				System.out.println("> 변경할 주소를 입력하세요");
				System.out.print("> 주소 : ");
				sc.nextLine();
				member.setAddress(sc.nextLine());
				result = memberController.updateAddress(member);
				printResultMsg(result, "주소 변경 성공!", "주소 변경 실패!");
				break;
				
			case "9" : return;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}


	private String updateId() {
		System.out.println("> 변경할 아이디를 입력하세요.");
		System.out.print("아이디 : ");
		return sc.next();
	}

	private String deleteId() {
		System.out.println("> 삭제할 아이디를 입력하세요.");
		System.out.print("아이디 : ");
		return sc.next();
	}

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
	
	private String inputId() {
		System.out.println("> 조회할 아이디를 입력하세요.");
		System.out.print("아이디 : ");
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
        if(list == null || list.isEmpty()) {
            System.out.println("> 조회된 행이 없습니다.");
        }
        else {
            System.out.println("> 조회결과");
            System.out.println("=====================================================");
            System.out.printf("%15s%15s%15s%15s%15s%15s%15s%n", 
                                "id", "name", "gender", "birthday", "email", "address", "regDate");
            System.out.println("-----------------------------------------------------");
            for(Member member : list) {
                System.out.printf("%15s%15s%15s%15s%15s%15s%15s%n", 
                        member.getId(), 
                        member.getName(),
                        member.getGender(),
                        member.getBirthday(),
                        member.getEmail(),
                        member.getAddress(),
                        member.getRegDate());
            }
            System.out.println("-----------------------------------------------------");
            System.out.println();
        }
    }
	
	/**
	 * 조회할 회원명 입력 메소드
	 * @return
	 */
	private String inputMemberName() {
		System.out.println("> 조회할 이름을 입력하세요.");
		System.out.println("이름 : ");
		return sc.next();
	}

	/**
	 * 신규회원정보를 입력받는 메소드 
	 * @return
	 */
	private Member inputMember() {
		Member member = new Member();
		System.out.println("> 신규회원정보를 입력하세요");
		System.out.print("> 아이디 : ");
		member.setId(sc.next());
		
		System.out.print("> 이름 : ");
		member.setName(sc.next());
		
		System.out.print("> 성별(M/F) : ");
		member.setGender(String.valueOf(sc.next().toUpperCase().charAt(0)));
		
		System.out.print("> 생일(예:19990314) : ");
		String _birthday = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date birthday = null;
		
		try 
		{
			long millis = sdf.parse(_birthday).getTime();
			birthday = new Date(millis);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		member.setBirthday(birthday);
		
		System.out.print("> 이메일 : ");
		member.setEmail(sc.next());
		
		System.out.print("> 주소 : ");
		sc.nextLine();
		member.setAddress(sc.nextLine());
		
		
		return member;
	}

	/**
	 * DML 처리 결과를 출력하는 메소드
	 * @param result
	 * @param successMsg
	 * @param failureMsg
	 */
	private void printResultMsg(int result, String successMsg, String failureMsg) {
		if(result > 0)
		{
			System.out.println("> " + successMsg);
		}
		else
		{
			System.out.println("> " + failureMsg);
		}
	}

}










