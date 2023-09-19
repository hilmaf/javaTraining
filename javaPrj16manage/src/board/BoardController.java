package board;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BoardController {
	
	// 멤버 변수
	Scanner sc;
	
	public BoardController() {
		sc = new Scanner(System.in);
	}
	
	// 글 게시
	public void post() {
		// 데이터 입력받기
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("글쓴이: ");
		String author = sc.nextLine();
		System.out.print("제목: ");
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
			System.out.println("[게시글 작성] 예외 발생");
			isPosted = false;
			System.out.println("회원가입 실패...");
		}
		
		// 결과출력
		if(isPosted) {
			System.out.println("회원가입을 완료하였습니다.");
		} else {
			System.out.println("회원가입 실패...");
		}
		
	}
	
	public void search() {
		// 데이터 입력받기(글제목, 글쓴이)
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("글쓴이: ");
		String author = sc.nextLine();
		// 데이터 뭉치기
		BoardData boardData = new BoardData();
		// 할일
		BoardDao dao = new BoardDao();
		
		boolean isSearched;
		try {
			dao.search(boardData);
			isSearched = true;
		} catch(Exception e) {
			System.out.println("[게시글 조회] 예외 발생");
			isSearched = false;
		}
		// 결과출력
		if(isSearched) {
			
		} else {
			System.out.println("게시글 조회 실패");
		}
	}
	
}
