package manager;

import main.Main;
import theater.Theater;
import util.MyUtil;

public class SeatManager {
	
	String[][] seats = new String[][] {
		 {"A1", "A2", "A3", "A4"}, 
		 {"B1", "B2", "B3", "B4"}, 
		 {"C1", "C2", "C3", "C4"}, 
		 {"D1", "D2", "D3", "D4"}};
	
	public void selectSeats() {
		
		int thtnum = convertTheaterToNum();
		printSeatsInfo(thtnum);
//		유저 입력받기
		String seat = MyUtil.scanUserLine();
//		입력된 좌석에 따라 좌석배치도 변화 주기
		changeSeatInfo(seat);
	}


	private int convertTheaterToNum() {
		if(Main.userTheater == TheaterManager.theaterArr[0]) {
			return 1;
		} else if(Main.userTheater == TheaterManager.theaterArr[1]) {
			return 2;
		} else if(Main.userTheater == TheaterManager.theaterArr[2]) {
			return 3;
		} else {
			return 4;
		}
	}


	private void changeSeatInfo(String seat) {
		int reserved=0;
		int row; int col;
		
		for(row=0; row<4; row++) {
			for(col=0; col<4; col++) {
				if(seats[row][col].equals(seat)) {//막힘
					seats[row][col]="X";
					// 예매완료 안내창
					reserved++; // 예매된 좌석 수
					System.out.println("**** '" + seat + "'" + "예매가 완료 되었습니다. ****");
				}
			}
		}
	}

	private void printSeatsInfo(int num) {
		System.out.println("");
		switch(num) {
		case 1: System.out.println(Theater.Name01 + "관 좌석 보기"); break;
		case 2: System.out.println(Theater.Name02 + "관 좌석 보기"); break;
		case 3: System.out.println(Theater.Name03 + "관 좌석 보기"); break;
		case 4: System.out.println(Theater.Name04 + "관 좌석 보기"); break;
		}
		System.out.println("");
		System.out.println("     ======SCREEN======");
		System.out.println("");
		System.out.printf("A   %2s | %2s | %2s | %2s\n", seats[0][0], seats[0][1], seats[0][2], seats[0][3]);
		System.out.printf("B   %2s | %2s | %2s | %2s\n", seats[1][0], seats[1][1], seats[1][2], seats[1][3]);
		System.out.printf("C   %2s | %2s | %2s | %2s\n", seats[2][0], seats[2][1], seats[2][2], seats[2][3]);
		System.out.printf("D   %2s | %2s | %2s | %2s\n", seats[3][0], seats[3][1], seats[3][2], seats[3][3]);
		System.out.println("");
		System.out.print("좌석을 선택하세요 (예: A2, B3): ");
	}

	
	
}
