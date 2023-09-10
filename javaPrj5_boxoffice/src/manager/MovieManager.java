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
		System.out.println("관람할 영화를 선택하세요. (1 or 2 or 3 or 4)");
		System.out.print("입력: ");
	}
	
	public void printUserChoice(int num) {
		
		switch(num) {
		case 1: System.out.println("\n" + Movie.Name01 + "을/를 선택하셨습니다.\n");
				Main.userMovie = Movie.Name01;
				System.out.println("====| 영화 정보 |====");
				System.out.println(movieArr[0]);
				movieArr[0].printBriefInfo(); 
				System.out.println("\n"); break;
		case 2: System.out.println("\n" + Movie.Name02 + "을/를 선택하셨습니다.\n");
				Main.userMovie = Movie.Name02;
				System.out.println("====| 영화 정보 |====");
				System.out.println(movieArr[1]);
				movieArr[1].printBriefInfo(); 
				System.out.println("\n"); break;
		case 3: System.out.println("\n" + Movie.Name03 + "을/를 선택하셨습니다.\n");
				Main.userMovie = Movie.Name03;
				System.out.println("====| 영화 정보 |====");
				System.out.println(movieArr[2]);
				movieArr[2].printBriefInfo(); 
				System.out.println("\n"); break;
		case 4: System.out.println("\n" + Movie.Name04 + "을/를 선택하셨습니다.\n");
				Main.userMovie = Movie.Name04;
				System.out.println("====| 영화 정보 |====");
				System.out.println(movieArr[3]);
				movieArr[3].printBriefInfo(); 
				System.out.println("\n"); break;
		}
	}
}
