package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import user.Member;

public class MemberManager {

	// 멤버 변수
	private Scanner sc = new Scanner(System.in);
	Map<String, Member> userMap = new HashMap<String, Member>();
	public void startProcess() {
		// 메뉴 보여주기(회원가입/로그인)
		showMenu();
		// 메뉴 선택(유저 입력받기)
		String str = scanUserInput();
		switch(str) {
		case "1": join(); break;
		case "2": login(); break;
		}
	}
	
	private void showMenu() {
		System.out.println("--------------");
		System.out.println("1. 회원가입");
		System.out.println("2 로그인");
		System.out.println("--------------");
	}
	
	private String scanUserInput() {
		return sc.nextLine();
	}
	
	private void join() {
		// 아이디 입력 받기
		System.out.print("아이디 : ");
		String userId = scanUserInput();
		// 비밀번호 입력 받기
		System.out.print("비밀번호 : ");
		String userPwd = scanUserInput();
		// 닉네임 입력 받기
		System.out.print("닉네임 : ");
		String userNick = scanUserInput();
		
		// 아이디, 비밀번호, 닉네임 검사하기
		// 비밀번호: 8~16자 사이 길이=
		// 닉네임: 2자 이상
		
		try {
			checkValidation(userId, userPwd, userNick);			
		} catch(Exception e) {
			System.out.println("예외 발생");
			return;
		}

		// 멤버 객체 생성하기
		Member user = new Member(userId, userPwd, userNick);		
		
		// 컬렉션에 담아주기
		userMap.put(user.getId(), user);
		
		// 회원가입 완료 및 회원정보 출력해주기
		System.out.println("회원가입이 완료되었습니다.");
		Member x = userMap.get(userId);
		System.out.println(x);
	}
	
	private void checkValidation(String id, String pwd, String nick) throws Exception {
		// 아이디: 중복 불가
		if(userMap.containsKey(id)) {
			throw new Exception("중복된 아이디");
		}
		
		if(pwd.length()<8 || pwd.length()>16) {
			throw new Exception("비밀번호는 8~16자까지 가능");
		}
		
		if(nick.length()<2) {
			throw new Exception("닉네임은 2자 이상");
		}
	}
	
	private void login() {
		// 아이디 입력받기
		System.out.print("아이디 : ");
		String userId = scanUserInput();
		// 비밀번호 입력받기
		System.out.print("비밀번호 : ");
		String userPwd = scanUserInput();
		// 일치 여부 판별
		Member x = userMap.get(userId);
		if(userMap.containsKey(userId)) {
			if(userPwd.equals(x.getPwd())) {
				System.out.println("로그인 하였습니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}

