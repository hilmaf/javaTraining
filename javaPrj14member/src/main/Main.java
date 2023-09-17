package main;

import member.console.MemberManager;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("=== 회원 관리 프로그램 ===");
	
		MemberManager mm = new MemberManager();
		
		while(true) {
			try {
				mm.manageMember();							
			} catch(Exception e) {
				String errorMsg = e.getMessage();
				System.out.println(errorMsg);
				System.out.println("예외 발생.. 처음 메뉴로 돌아갑니다.");
			}
		}
		
	}

}
