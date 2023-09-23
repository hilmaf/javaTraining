package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardController {
	
	// 멤버 변수
	private Scanner sc;
	
	public BoardController() {
		sc = new Scanner(System.in);
	}
	
	// 메뉴 보여주기
	public void manage() {
		System.out.println("--- 메뉴 ---");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 조회(작성자 기준)");
		
		String str = sc.nextLine();
		
		switch(str) {
		case "1": post(); break;
		case "2" : search(); break;
		}
	}
	
	// 글 게시
	private void post() {
		// 데이터 입력받기
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("글쓴이: ");
		String author = sc.nextLine();
		System.out.print("내용: ");
		String content = sc.nextLine();
		
		// 데이터 뭉치기
		BoardData boardData = new BoardData(title, author, content);
		// 할일
		BoardDao dao = new BoardDao();
		
		boolean isPosted;
		try {
			dao.post(boardData);			
			isPosted = true;
		} catch(Exception e) {
			isPosted = false;
			System.out.println("게시글 작성 중 오류가 발생하였습니다.");
		}
		
		// 결과출력
		if(isPosted) {
			System.out.println("글이 게시되었습니다.");
		} else {
			System.out.println("게시글 작성 실패...");
		}
		
	}
	
	private void checkPostValidation() {
		
	}
	
	private void search() {
		// 데이터 입력받기(글쓴이)
		System.out.print("글쓴이: ");
		String author = sc.nextLine();
		// 데이터 뭉치기
		BoardData boardData =  new BoardData(author);
		// 할일
		BoardDao dao = new BoardDao();
		
		try {
			dao.search(boardData);
		} catch(Exception e) {
			System.out.println("[게시글 조회] 예외 발생");
		}
		
	}
	
	private void checkSearchValidation() {
		
	}
}
