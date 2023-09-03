package game;

import java.util.Scanner;

import character.DealerNinja;
import character.HealerNinja;
import character.Ninja;
import main.Main;

public class NinjaManager {
	
	String userNinja;
	
	public void generateNinja() {
		
		Ninja n1 = new Ninja();
		n1.name = "나루토";
		n1.hp = 200;
		n1.atk = 20;
		n1.def = 13;
		
		DealerNinja n2 = new DealerNinja();
		n2.name = "사스케";
		n2.hp = 180;
		n2.atk = 24;
		n2.def = 10;
		
		HealerNinja n3 = new HealerNinja();
		n3.name = "사쿠라";
		n3.hp = 150;
		n3.atk = 15;
		n3.def = 8;
		n3.heal = 5;
	}
	
	public void printSelectvMsg() {
		System.out.println("닌자 선택 ㄱㄱ");
		System.out.println("1. " + Main.n1.name);
		System.out.println("2. " + Main.n2.name);
		System.out.println("3. " + Main.n3.name);
		System.out.println();
		System.out.println("숫자 입력: ");
	}
	
	
	//캐릭터 선택
	public void selectNinja() {
		generateNinja();
		int num = userInput();
		setUserNinja(num);
	}
	
	//유저 입력 받기
	public int userInput() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}
	
	//선정 캐릭터 표시
	public void setUserNinja(int x) {
		switch(x) {
		case 1: userNinja = Main.n1.name;
		case 2: userNinja = Main.n2.name;
		case 3: userNinja = Main.n3.name;
		default: System.out.println("잘못 입력함");
		}
	}
}
