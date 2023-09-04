package main;

import battle.BattleManager;
import battle.NinjaManager;

public class Main {

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
	}

}
