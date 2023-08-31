package game;

public class GameManager {

	//게임 시작
	public void gameProcess() {
		PokemonManager pm = new PokemonManager();
		pm.generatePokemon();
		pm.printPokemonList();
		pm.selectPokemon();
		
		//배틀
		BattleManager bm = new BattleManager();
		bm.battleStart();
		
		
	}
	
	
}
