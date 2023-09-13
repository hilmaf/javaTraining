package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("=== 회원가입 및 로그인 ===");
		
		MemberManager mm = new MemberManager();
		while(true) {
			mm.startProcess();			
		}
		
	}

}
