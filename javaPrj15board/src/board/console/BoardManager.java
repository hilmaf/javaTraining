package board.console;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import board.Board;

public class BoardManager {

//	Map<String, Board> boardList = new HashMap<String, Board>();
	
	// 멤버변수
	Scanner sc;
	String x;
	File f;
	PrintWriter pw;
	BufferedReader br;
	Board searched;
	
	// 생성자
	public BoardManager() throws Exception {
		sc = new Scanner(System.in);
		x = File.separator;
		f = new File("C:" + x + "Java1" + x + "boarddata.txt");
		pw = new PrintWriter(new FileWriter(f, true), true);
		br = new BufferedReader(new FileReader(f));
	}
	
	// 글쓰기(입력)
	// 글 불러오기(출력)
	
	public void board() throws Exception {
		// 메뉴 보여주기
		showMenu();
		// 메뉴 선택
		selectMenu();
	}
	
	private void showMenu() {
		System.out.println("---Menu---");
		System.out.println("1. 글쓰기");
		System.out.println("2. 글읽기");
		System.out.println("3. 전체 게시판 보기");
	}
	
	private void selectMenu() throws Exception {
		// 유저 입력 받기
		String str = sc.nextLine();
		// 입력값에 따른 실행 경우 분류
		switch(str) {
		// 글쓰기(입력)
		case "1": write(); break;
		// 글 불러오기(출력)
		case "2": read(); break;
		// 모든 게시판 글 조회
		case "3" : selectAllBoard(); break;
		default: System.out.println("잘못 입력했습니다.");
		}
	}
	
	private void write() {
		// 자바 ---> 파일
		// 입력받기
		System.out.print("제목: ");
		String userTitle = sc.nextLine();
		
		System.out.print("글쓴이: ");
		String userAuthor = sc.nextLine();
		
		System.out.println("내용:");
		String userContent = sc.nextLine();
		
		// Board 객체 생성(자바 내 관리 용이)
//		Board post = new Board(userTitle, userContent, userAuthor);
//		boardList.put(post.getAuthor(), post);
		
		// 출력스트림 생성

		// 파일에 저장하기
		pw.println(userTitle + "#" + userAuthor + "#" + userContent);
	}
	
	private void read() throws Exception {
		// 파일 ---> 자바
		// 유저 입력 받기
		System.out.println("글쓴이: ");
		String author = sc.nextLine();
		
//		// 게시글 정보 컬렉션에서 조회하기(글제목, 글쓴이)
//		if(boardList.containsKey(author)) {
//			searched = boardList.get(author);
//		}
		
		// 게시글 정보 파일에서 조회하기(글제목, 글쓴이)
		boolean isSearched = false;
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			int idx = str.indexOf("#");
			String memoTitle = str.substring(0, idx);
			
			int idx2 = str.lastIndexOf("#");
			String memoAuthor = str.substring(idx+1, idx2);
			
			isSearched = author.equals(memoAuthor);
			if(isSearched) {
				System.out.println(str);
				break;
			}
		}
		// 비교 판별하기
		
		if(isSearched) {
			System.out.println(searched);
		} else {
			System.out.println("검색 결과를 찾지 못했습니다.");
		}
	}
	
	private void selectAllBoard() throws Exception {
		// 입력스트림 생성
		br = new BufferedReader(new FileReader(f));
		// 게시글 정보 조회하기
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}

	}
}
