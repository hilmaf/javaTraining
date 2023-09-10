package main;

import java.util.Scanner;

import manager.MovieManager;
import manager.SeatManager;
import manager.TheaterManager;
import movie.Movie;
import theater.Theater;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static Movie userMovie;
	public static Theater userTheater;
	
	public static void main(String[] args) {
		
		
		
//		영화 선택(영화 정보 확인 가능)
		MovieManager movieManager = new MovieManager();
		movieManager.selectMovie();

		//영화관 선택
		TheaterManager theaterManager = new TheaterManager();
		theaterManager.selectTheaterType();
		
		//좌석 선택(좌석배치도 확인 가능)
		SeatManager seatManager = new SeatManager();
		seatManager.selectSeats();
		//좌석 예매
		
		//계산 및 출력

	
	}
}