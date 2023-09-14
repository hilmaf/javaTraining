package main;

import java.io.BufferedReader;
import java.io.File;
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
	public void showMenu() {
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
		default: throw new Exception();
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
		
	}
	
	// 로그인
	
	// 모든 회원 정보 조회
	
}
