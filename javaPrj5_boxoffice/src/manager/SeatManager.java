package manager;

import main.Main;
import seat.Seat;
import theater.Theater;
import util.MyUtil;
	

	public class SeatManager {
	
	public static String[][] seats = new String[][] {
			 {"A1", "A2", "A3", "A4"}, 
			 {"B1", "B2", "B3", "B4"}, 
			 {"C1", "C2", "C3", "C4"}, 
			 {"D1", "D2", "D3", "D4"}};
		
			 
	public void selectSeats() {
		
		System.out.println("\n상영관 선택을 완료하셨습니다.\n좌석 예매 창으로 전환됩니다.");
		System.out.println("\n");
		
		while(true) {
			int thtnum = convertTheaterToNum();
			printSeatsInfo(thtnum);
//			유저 입력받기
			String seat = MyUtil.scanUserLine();
			setUserSeat(seat);
//			입력된 좌석에 따라 좌석배치도 변화 주기
			changeSeatInfo(seat);
			System.out.println("\n예매를 계속 진행하시겠습니까? (1.yes 2. no)");
			int num = MyUtil.scanUserInput();
			if(num == 2) {
				break;
			}
		}
	}
	
	private void setUserSeat(String seat) {
		switch(seat) {
		case "A1": Main.userSeat.add("A1"); break;
		case "A2": Main.userSeat.add("A2"); break;
		case "A3": Main.userSeat.add("A3"); break;
		case "A4": Main.userSeat.add("A4"); break;
		case "B1": Main.userSeat.add("B1"); break;
		case "B2": Main.userSeat.add("B2"); break;
		case "B3": Main.userSeat.add("B3"); break;
		case "B4": Main.userSeat.add("B4"); break;
		case "C1": Main.userSeat.add("C1"); break;
		case "C2": Main.userSeat.add("C2"); break;
		case "C3": Main.userSeat.add("C3"); break;
		case "C4": Main.userSeat.add("C4"); break;
		case "D1": Main.userSeat.add("D1"); break;
		case "D2": Main.userSeat.add("D2"); break;
		case "D3": Main.userSeat.add("D3"); break;
		case "D4": Main.userSeat.add("D4"); break;
		}
	}


	private int convertTheaterToNum() {
		if(Main.userTheater == Theater.Name01) {
			return 1;
		} else if(Main.userTheater == Theater.Name02) {
			return 2;
		} else if(Main.userTheater == Theater.Name03) {
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
		System.out.println("   ======SCREEN======");
		System.out.println("");
		System.out.printf("A   %2s | %2s | %2s | %2s\n", seats[0][0], seats[0][1], seats[0][2], seats[0][3]);
		System.out.printf("B   %2s | %2s | %2s | %2s\n", seats[1][0], seats[1][1], seats[1][2], seats[1][3]);
		System.out.printf("C   %2s | %2s | %2s | %2s\n", seats[2][0], seats[2][1], seats[2][2], seats[2][3]);
		System.out.printf("D   %2s | %2s | %2s | %2s\n", seats[3][0], seats[3][1], seats[3][2], seats[3][3]);
		System.out.println("");
		System.out.print("좌석을 선택하세요 (예: A2, B3): ");
	}

	
	
}
