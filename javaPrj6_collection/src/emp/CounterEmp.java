package emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import menu.Menu;

public class CounterEmp {
	
	private static Scanner sc = new Scanner(System.in);
	List menu = new ArrayList();
	
	public void work() {
		
		// 메뉴판 보여주기
		showMenu();
		// 유저 입력 받기
		System.out.println("메뉴를 입력하세요");
		int menuNum = scanUserInput();
		// 선택한 메뉴 확인시켜주기
		printCustomerMenu(menuNum);
		// 수량 입력 받기
		int menuCnt = scanUserInput();
		// 가격 보여주기 + 결제
		int price = getMenuPrice(menuNum);
		int totalPrice=0;
		totalPrice += price * menuCnt;
		System.out.println("결제 금액: " + totalPrice);
	}

	private int getMenuPrice(int menuNum) {
		Menu result = (Menu)menu.get(menuNum-1);
		int price = result.getPrice();
		return price;
	}

	private void printCustomerMenu(int menuNum) {
		Menu print = (Menu)menu.get(menuNum-1);
		System.out.println("메뉴이름 : " + print.getName());
		System.out.println("메뉴가격 : " + print.getPrice());
		
	}

	private int scanUserInput() {
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		return num;
	}

	private void showMenu() {
		//메뉴판 준비
		menu.add(new Menu("아메리카노", 3000));
		menu.add(new Menu("바닐라라떼", 4000));
		menu.add(new Menu("카푸치노", 5000));
		menu.add(new Menu("얼그레이티", 6000));
		
		//메뉴판 보여주기
		for(int i=0; i<menu.size(); i++) {
			Menu x = (Menu)menu.get(i);
			System.out.println(i+1 + ". " + x.getName() + " (" + x.getPrice() + "원)");
		}
	}
	
}
