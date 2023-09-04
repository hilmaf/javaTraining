package battle;

import java.util.Scanner;

import character.Ninja;
import main.Main;

public class NinjaManager {

	public void selectNinja() {
//		캐릭터 생성
		generateNinja();
//		캐릭터 목록 보여주기
		showNinjaList();
//		유저 입력받기
		int num = scanUserInput();
//		유저 캐릭터 준비하기
		setUserNinja(num);
//		컴퓨터 캐릭터 준비하기
		setEnemyNinja();
	}

	private void setUserNinja(int num) {
		switch(num) {
		case 1: Main.userNinja = userNaruto;
		case 2:
		case 3: 
		}
	}

	private int scanUserInput() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	private void showNinjaList() {
		System.out.println("<< Ninja List >>");
		System.out.println("1. " + Main.userNaruto.getName());
		System.out.println("2. " + Main.userSasuke.getName());
		System.out.println("3. " + Main.userSakura.getName());
	}

	private void generateNinja() {
		Ninja userNaruto = new Ninja("나루토", 200, 25, 10, "그림자분신");
		Ninja userSasuke = new Ninja("사스케", 190, 28, 12, "사자연탄");
		Ninja userSakura = new Ninja("사쿠라", 180, 24, 15, "앵화충");
		Ninja enemyNaruto = new Ninja("나루토", 200, 25, 10, "그림자분신");
		Ninja enemySasuke = new Ninja("사스케", 190, 28, 12, "사자연탄");
		Ninja enemySakura = new Ninja("사쿠라", 180, 24, 15, "앵화충");
	}
	
	
	
	

}
