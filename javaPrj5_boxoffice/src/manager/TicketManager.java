package manager;

import main.Main;
import theater.Theater;
import util.MyUtil;

public class TicketManager {

	public void calTicketPrice() {
		printUserTicket();
		int userPrice = setTicketPrice();
		System.out.println("회원님의 티켓 가격은 " + userPrice + "원 입니다.");
		System.out.println("");
		System.out.println("결제하시겠습니까?");
		System.out.println("결제하시려면 '결제'라고 입력해주세요.");
		String str = MyUtil.scanUserLine();
		System.out.println("\n결제가 완료되었습니다.");
		System.out.println("\n영화 예매 프로그램을 종료합니다.");
		System.out.println("즐거운 관람 되세요!");
	}
	
	private int setTicketPrice() {
		int cnt = 0;
		
		if(Main.userTheater == Theater.Name01) {
			for(int i = 0; i<Main.userSeat.size(); i++) {
				if(Main.userSeat.get(i)!=null) {
					cnt ++;
				} else if(Main.userSeat.get(i)==null) {
					break;
				}
			}
			int userPrice = 17000 * cnt;
			return userPrice;
		} else if(Main.userTheater == Theater.Name02) {
			for(int i = 0; i<Main.userSeat.size(); i++) {
				if(Main.userSeat.get(i) != null) {
					cnt ++;
				} else if(Main.userSeat.get(i)==null) {
					break;
				}
			}
			int userPrice = 18000 * cnt;
			return userPrice;
		} else if(Main.userTheater == Theater.Name03) {
			for(int i = 0; i<Main.userSeat.size(); i++) {
				if(Main.userSeat.get(i) != null) {
					cnt ++;
				} else if(Main.userSeat.get(i)==null) {
					break;
				}
			}
			int userPrice = 14000 * cnt;
			return userPrice;
		} else {
			for(int i = 0; i<Main.userSeat.size(); i++) {
				if(Main.userSeat.get(i) != null) {
					cnt ++;
				} else if(Main.userSeat.get(i)==null) {
					break;
				}
			}
			int userPrice = 16000 * cnt;
			return userPrice;
		}
				
	}

	private void printUserTicket() {
		System.out.println("");
		System.out.println("====| 회원님의 영화표 |====");
		System.out.println("영화: " + Main.userMovie + " / 상영관: " + Main.userTheater + " / 좌석: " + Main.userSeat);
	}

}
