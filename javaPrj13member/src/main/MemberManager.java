package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager {
	
	// 멤버변수
	private Scanner sc;
	private File f;
	private PrintWriter pw;
	private BufferedReader br;
	
	// 생성자
	public MemberManager() {
		sc = new Scanner(System.in);
		String x = File.separator;
	}
	// 메뉴
	public void showMenu() throws Exception {
		System.out.println("=== 메뉴 ===");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 전체 회원 조회");
		System.out.println("메뉴 번호를 입력하세요");
	
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1": join(); break;
		case "2": login(); break;
		case "3": selectAllUser(); break;
		default: System.out.println("잘못 입력하셨습니다");
		}
	}
	
	// 회원가입
	private void join() {
		System.out.println("--- 회원가입 ---");
		// 아이디, 비밀번호, 닉네임 입력하기
		System.out.println("아이디: ");
		String userId = sc.nextLine();

		System.out.println("비밀번호: ");
		String userPwd = sc.nextLine();
		
		System.out.println("닉네임: ");
		String userNick = sc.nextLine();
		
		// 파일(메모장)에 저장하기
		pw.println(userId + "#" + userPwd + "#" + userNick);
		
		System.out.println("회원가입 완료!");
	}
	
	// 로그인
	private void login() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("--- 로그인 ---");
		
		System.out.print("아이디: ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		
		boolean isOk = false;
		while(true) {
			// 파일에서 회원정보 조회
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			// 회원정보에서 id, pwd만 꺼내기
			int idx = str.indexOf("#");
			String memoId = str.substring(0, idx);

			int idx2 = str.indexOf("#");
			String memoPwd = str.substring(idx+1, idx2);
			
			// 일치 여부 확인
			isOk = id.equals(memoId) && pwd.equals(memoPwd);
			if(isOk) {
				break;
			}
		}//while end
		
		if(isOk) {
			System.out.println("로그인 성공");		
		} else {
			System.out.println("로그인 실패");
		}
	}// login ed
	
	// 모든 회원 정보 조회
	private void selectAllUser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		// 파일에서 모든 정보 읽기
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
	}
	
}
