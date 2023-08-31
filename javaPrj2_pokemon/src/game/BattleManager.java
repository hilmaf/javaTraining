package game;

import mob.Pokemon;

public class BattleManager {

	Pokemon enemyPokemon;
	// 배틀
	// 적 몬스터 랜덤으로 정하기
	public void battleStart() {
		System.out.println(PokemonManager.userPokemon + "vs" + enemyPokemon);
		System.out.println("배틀 시작!");
		
		selectEnemy();
		Pokemon winner = fight(PokemonManager.userPokemon, enemyPokemon);
		System.out.println(winner.name + " 승리!");
	}
	
	public void selectEnemy() {
		int num=(int)(Math.random()*3+1);
		switch(num) {
		case 1: enemyPokemon = PokemonManager.p1;
		case 2: enemyPokemon = PokemonManager.p2;
		case 3: enemyPokemon = PokemonManager.p3;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	// 번갈아가며 공격하기
	// 데미지 시스템
	public Pokemon fight(Pokemon attacker, Pokemon defender) {
		while(true) {
			attacker.bodyAttack();
			int damage = attacker.atk - defender.def;
			System.out.println("데미지: " + damage);
			System.out.println(defender.name + "의 남은 체력: " + defender.hp);
			defender.hp -= damage;
			
			if(defender.hp <= 0) {
				return attacker;
			}
		}
	}
	
	
	
}
