package board;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BoardDao {
	
	// 멤버 변수
	File file;
	
	// 생성자
	public BoardDao() {
		String x = File.separator;
		String fileName = "C:" + x + "Java1" + x + "javaPrj16manage" + x + "data.txt";
		// 파일 객체 생성
		file = new File(fileName);
	}
	
	public boolean post(BoardData boardData) throws Exception {
		// 스트림 준비(출력)
		FileWriter fw = new FileWriter(file, true);
		// 저장
		String dataStr 
		= boardData.getTitle() + "@" + boardData.getAuthor() + "@" + boardData.getContent() + "\n";
		fw.write(dataStr);
		fw.close();
		// 결과 리턴
		return true;
	}
	
	public void search(BoardData boardData) throws Exception {
		// 스트림 준비
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// 조회 및 비교
		String memoStr = null;
		while(true) {
			// 데이터 조회하기
			memoStr = br.readLine();		
			if(memoStr == null) {
				break;
			}
			// 조회한 데이터에서 글쓴이만 꺼내기
			String memoAuthor 
			= memoStr.substring(memoStr.indexOf("@")+1, memoStr.lastIndexOf("@"));		
			
			// 비교
			boolean isSearched = memoAuthor.equals(boardData.getAuthor());
			if(isSearched) {
				System.out.println(memoStr);
			}
		}	
		br.close();
		fr.close();
	}
	
}
