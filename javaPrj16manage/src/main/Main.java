package main;

import board.BoardController;

public class Main {

	public static void main(String[] args) {
		
		BoardController boardController = new BoardController();
		
		while(true) {
		boardController.manage();
		}
		
	}

}
