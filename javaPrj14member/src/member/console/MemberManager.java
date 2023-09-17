package member.console;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager {

	Scanner sc;
	private File f;
	private PrintWriter pw;
	private BufferedReader br;
	
	public MemberManager() throws Exception {
		sc = new Scanner(System.in);
		String x = File.separator;
		f = new File("D:" + x + "Java1" + x + "data.txt");
		pw = new PrintWriter(new FileWriter(f, true), true);
		br = new BufferedReader(new FileReader(f));
	}
	
	public void manageMember() throws Exception {
		
		// 메뉴 보여주기
		showMenu();
		// 메뉴 선택
		selectMenu();
		// 회원 정보 조회
		selectAllUsers();
		
	}
	
	private void showMenu() {
		System.out.println("=== 메뉴 ===");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 전체 회원 조회");
		System.out.println("메뉴 번호를 입력하세요");		
	}
	
	private void selectMenu() throws Exception {
		String str = scanUserInput();
		switch(str) {
		case "1": join(); break;
		case "2": login(); break;
		default: throw new Exception();
		}
	}
	
	private void join() {
		System.out.println("--- 회원가입 ---");
		System.out.print("아이디: ");
		String userId = sc.nextLine();
		System.out.print("비밀번호: ");
		String userPwd = sc.nextLine();
		System.out.print("닉네임: ");
		String userNick = sc.nextLine();
		
		pw.println(userId + "#" + userPwd + "#" + userNick);
		
		System.out.println("회원가입이 완료되었습니다.");
	}
	
	private void login() throws Exception {
		System.out.println("--- 로그인 ---");
		System.out.println("아이디: ");
		String id = sc.nextLine();
		System.out.println("비밀번호: ");
		String pwd = sc.nextLine();
		
		boolean isOk = false;
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			int idx = str.indexOf("#");
			String memoId = str.substring(0, idx);
			
			int idx2 = str.lastIndexOf("#");
			String memoPwd = str.substring(idx+1, idx2);
			
			isOk = id.equals(memoId) && pwd.equals(memoPwd);
			if(isOk) {
				break;
			}
		}
		
		if(isOk) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	private void selectAllUsers() throws Exception {
		br = new BufferedReader(new FileReader(f));
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
	}
	
	private String scanUserInput() {
		return sc.nextLine();
	}
	
	
}
