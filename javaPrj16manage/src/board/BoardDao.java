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
		String fileName = "C:" + x + "Java1" + x + "javaPrj16manage" + x + "boarddata.txt";
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
	
	public boolean search(BoardData boardData) throws Exception {
		// 스트림 준비
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// 조회
		String memoStr = br.readLine();
				
		br.close();
		fr.close();
		// 조회한 데이터에서 글쓴이만 꺼내오기
		String memoAuthor 
		= memoStr.substring(memoStr.indexOf("@")+1, memoStr.lastIndexOf("@"));
		// 비교
		boolean isSearched = memoAuthor == boardData.getAuthor();
		// 결과 리턴
		return isSearched;
	}
	
}
