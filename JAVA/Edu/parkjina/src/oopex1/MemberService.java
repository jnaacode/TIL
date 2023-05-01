package oopex1;


import java.util.Scanner;

import oopex0.Member;

public class MemberService {
	
	private Scanner sc = new Scanner(System.in);  
	
	private Member memberInfo = null;
	private Member loginMember = null;
	
	public MemberService() {}
	
	public void displayMenu() {
		
		int menuNum =0;
	
		do {
			System.out.println("=======회원 정보 관리 프로그램 v1=======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램종료");
			
			System.out.println("메뉴입력 >> ");
			menuNum = sc.nextInt();
			sc.nextLine();
	
			switch(menuNum) {
			
			case 1 : System.out.println(signUp());break;
			case 2 : System.out.println(login());break;
			case 3 : ;break;
			case 4 : ;break;
			case 0 : System.out.println("프로그램을 종료합니다."); ;break;
				
				default : 
			}
			
		}while(menuNum!=0);
		
	}
	
	public String signUp() {
		
		System.out.println("\n****회원 가입 기능****");
		
		System.out.print("아이디 : ");
		String memberId =sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw =sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 =sc.next();
		
		System.out.print("이름 : ");
		String memberName =sc.next();

		System.out.print("나이 : ");
		String memberAge= sc.next();
		
		if(memberPw.equals(memberPw2)) {
			
			memberInfo= new Member(memberId,memberPw,memberName,memberAge);
			
			return "회원가입 성공 ";
		}else {
			return "비밀번호 불일치로 회원가입 실패";
		}
		
	}
	public String login() {
		
		System.out.println("\n*****로그인*****");
		
		if(memberInfo ==null) {
			return "회원가입부터 진행 해주세요.";
		}
		
		System.out.print("아이디입력 : ");
		String memberId =sc.next();

		System.out.print("비밀번호입력 : ");
		String memberPw =sc.next();
		
		if(memberInfo.getMemberId().equals(memberId)&&memberInfo.getMemberPw().equals(memberPw)) {
			
			loginMember = memberInfo;
			
			return loginMember.getMemberName() + "님 환영합니다.";
		}else {
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
 			
			
		}
		
	}
	
}
		