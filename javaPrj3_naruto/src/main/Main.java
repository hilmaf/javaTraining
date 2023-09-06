package main;

import battle.BattleManager;
import battle.NinjaManager;
import character.Ninja;

public class Main {

	public static Ninja userNaruto;
	public static Ninja userSasuke;
	public static Ninja userSakura;
	public static Ninja enemyNaruto;
	public static Ninja enemySasuke;
	public static Ninja enemySakura;
	public static Ninja userNinja;
	public static Ninja enemyNinja;

	public static void main(String[] args) {
		
		//나루토
		System.out.println("=================");
		System.out.println("|  Naruto Game  |");
		System.out.println("=================");

		NinjaManager ninjaManager = new NinjaManager();
		BattleManager battleManager = new BattleManager();
		
		//캐릭터 선택
		ninjaManager.selectNinja();
		//배틀
		battleManager.proceedBattle();
		
		System.out.println("=================");
		System.out.println("|   Exit Game!  |");
		System.out.println("=================");
	}

}
