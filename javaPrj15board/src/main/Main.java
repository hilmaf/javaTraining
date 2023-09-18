package main;

import java.io.IOException;

import board.console.BoardManager;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("==================");
		System.out.println("| Bulletin Board |");
		System.out.println("==================");
		
		BoardManager bm = new BoardManager();
		
		while(true) {
			bm.board();			
		}
		
		
		
		
		
	}

}
