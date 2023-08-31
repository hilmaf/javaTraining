package game;

import java.util.Scanner;

import mob.Pokemon;

public class PokemonManager {
	static Scanner sc = new Scanner(System.in);

	static Pokemon p1;
	static Pokemon p2;
	static Pokemon p3;
	
	public static Pokemon userPokemon;
	
	//포켓몬 생성
	public void generatePokemon() {
		p1 = new Pokemon();
		p1.name = "피카츄";
		p1.hp = 150;
		p1.atk = 20;
		p1.def = 10;
		p1.exp = 0;
		
		p2 = new Pokemon();
		p2.name = "라이츄";
		p2.hp = 140;
		p2.atk = 27;
		p2.def = 12;
		p2.exp = 0;
		
		p3 = new Pokemon();
		p3.name = "파이리";
		p3.hp = 145;
		p3.atk = 18;
		p3.def = 15;
		p3.exp = 0;
	}
	
	//포켓몬 선택(유저에게 입력받기)
	
	public void setUserPokemon(int x) {
				
		switch(x) {
		case 1: userPokemon = p1; break;
		case 2: userPokemon = p2; break;
		case 3: userPokemon = p3; break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("포켓몬 '" + x + "' 을(를) 선택하셨습니다");
		
	}
	
	public int UserInput() {
		int x = sc.nextInt();
		return x;
	}
	
	public void selectPokemon() {
		int num = UserInput();
		setUserPokemon(num);
	}
	
	
	public void printPokemonList() {
		System.out.println("원하는 포켓몬을 선택하세요");
		System.out.println("----<List>----");
		System.out.println("1. " + p1.name);
		System.out.println("2. " + p2.name);
		System.out.println("3. " + p3.name);
		System.out.println("");
		System.out.println("내가 선택한 포켓몬 : ");
		
	}
	
}
