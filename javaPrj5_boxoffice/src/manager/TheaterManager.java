package manager;

import main.Main;
import movie.Movie;
import theater.DolbyCinema;
import theater.General2D;
import theater.General3D;
import theater.Imax;
import theater.Theater;
import util.MyUtil;

public class TheaterManager {
	
	public static Theater[] theaterArr = new Theater[4]; 
	
	public void selectTheaterType() {
//		영화관 객체 생성
		generateTheater();
//		영화 선택 받아오기
		int mvnum = convertUserMovieToNum();
//		영화에 따른 상영관 선택지 보여주기
		printTheaterInfo(mvnum);
//		입력 받기
		int num = MyUtil.scanUserInput();
//		상영관 선정
		setUserTheater(mvnum, num);
	}
	
	private void generateTheater() {
		theaterArr[0] = new DolbyCinema();
		theaterArr[1] = new Imax();
		theaterArr[2] = new General2D();
		theaterArr[3] = new General3D();
	}

	private void setUserTheater(int mvnum, int num) {
		if(mvnum==1) {
			if(num == 1) {
				Main.userTheater = Theater.Name02;
			} else if(num == 2) {
				Main.userTheater = Theater.Name03;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		if(mvnum==2) {
			if(num==1) {
				Main.userTheater = Theater.Name01;
			} else if(num==2) {
				Main.userTheater = Theater.Name03;
			} else {
				System.out.println("잘못 입력하셨습니다.");				
			}
		}
		if(mvnum==3) {
			if(num==1) {
				Main.userTheater = Theater.Name01;
			} else if(num==2) {
				Main.userTheater = Theater.Name03;				
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		if(mvnum==4) {
			if(num==1) {
				Main.userTheater = Theater.Name03;
			} else if(num==2) {
				Main.userTheater = Theater.Name04;				
			} else {
				System.out.println("잘못 입력하셨습니다.");				
			}
		}
	}

	private void printTheaterInfo(int mvnum) {
		switch(mvnum) {
		case 1: System.out.printf("====| %s 상영관 정보 |====\n", Movie.Name01);
				System.out.println();
				System.out.println("1. 17:00  |  " + Theater.Name02);
				System.out.println("2. 15:00  |  " + Theater.Name03);
				System.out.println("\n상영관을 입력하세요(1 or 2)");
				System.out.print("상영관 : "); 
				System.out.println();break;
		case 2: System.out.printf("====| %s 상영관 정보 |====\n", Movie.Name02);
				System.out.println();
				System.out.println("1. 13:00  |  " + Theater.Name01);
				System.out.println("2. 10:00  |  " + Theater.Name03);
				System.out.println("\n상영관을 입력하세요(1 or 2)");
				System.out.print("상영관 : "); break;
		case 3: System.out.printf("====| %s 상영관 정보 |====\n", Movie.Name03);
				System.out.println();
				System.out.println("1. 16:00  |  " + Theater.Name01);
				System.out.println("2. 18:00  |  " + Theater.Name03); 
				System.out.println("\n상영관을 입력하세요(1 or 2)");
				System.out.print("상영관 : "); break;
		case 4: System.out.printf("====| %s 상영관 정보 |====\n", Movie.Name04);
				System.out.println();
				System.out.println("1. 09:00  |  " + Theater.Name03);
				System.out.println("2. 14:00  |  " + Theater.Name04);
				System.out.println("\n상영관을 입력하세요(1 or 2)");
				System.out.print("상영관 : "); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}

	private int convertUserMovieToNum() {
		if(Main.userMovie == Movie.Name01) {
			return 1;
		} else if(Main.userMovie == Movie.Name02) {
			return 2;
		} else if(Main.userMovie == Movie.Name03) {
			return 3;
		} else {
			return 4;
		}
		
	}
	
	
	
}
