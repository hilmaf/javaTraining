package board;

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
		dao.post(boardData);
		// 결과출력
		
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
		dao.search(boardData);
		// 결과출력
	}
	
}
