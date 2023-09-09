package manager;

import main.Main;
import movie.Elemental;
import movie.Movie;
import movie.Oppenheimer;
import movie.Smugglers;
import movie.Spiderman;
import util.MyUtil;

public class MovieManager {
	
	public static Movie[] movieArr = new Movie[4];
	
	public void selectMovie() {
//		영화 객체 생성
		generateMovie();
//		영화 목록 보여주기
		printMovieInfo();
//		유저 입력받기
		int num = MyUtil.scanUserInput();
//		선택한 영화 세부 정보 출력하기
		printUserChoice(num);
	}
	

	public static void generateMovie() {
		movieArr[0] = new Elemental(713);
		movieArr[1] = new Smugglers(508);
		movieArr[2] = new Oppenheimer(284);
		movieArr[3] = new Spiderman(72);
	}
	
	public void printMovieInfo() {
		System.out.println("================");
		System.out.println("| Cinema Today |");
		System.out.println("================");
		System.out.println("");
		System.out.println("1. " + Movie.Name01);
		System.out.println("2. " + Movie.Name02);
		System.out.println("3. " + Movie.Name03);
		System.out.println("4. " + Movie.Name04);
	}
	
	public void printUserChoice(int num) {
		
		switch(num) {
		case 1: Main.userMovie = movieArr[0];
				System.out.println(movieArr[0]);
				movieArr[0].printBriefInfo(); break;
		case 2: Main.userMovie = movieArr[1];
				System.out.println(movieArr[1]);
				movieArr[1].printBriefInfo(); break;
		case 3: Main.userMovie = movieArr[2];
				System.out.println(movieArr[2]);
				movieArr[2].printBriefInfo(); break;
		case 4: Main.userMovie = movieArr[3];
				System.out.println(movieArr[3]);
				movieArr[3].printBriefInfo(); break;
		}
	}
}
