package main;

import game.GameManager;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("======================");
		System.out.println("|    Pokemon Game    |");
		System.out.println("======================");
		
		GameManager gm = new GameManager();
		gm.gameProcess();
	}

}
