package main;

import boxoffice.Movie;

public class Main {

	public static void main(String[] args) {
		
		Movie mv1 = new Movie();
		mv1.title = "Take Care Of My Cat";
		mv1.director = "정재은";
		mv1.isDomestic = true;
		mv1.tomato = 3.4;
	
		System.out.println(mv1.title + "의 현 관객 수는 " + Movie.isScoring(500) + "명 입니다.");
		
		Movie mv2 = new Movie();
		mv2.title = "Mononoke Hime";
		mv2.director = "미야자키 하야오";
		mv2.isDomestic = false;
		mv2.tomato = 4.0;
		
		Movie mv3 = new Movie();
		mv3.title = "Lord of the Rings";
		mv3.director = "피터 잭슨";
		mv3.isDomestic = false;
		mv3.tomato = 4.2;
		
		Movie mv4 = new Movie();
		mv4.title = "20th Century Women";
		mv4.director = "노아 바움벡";
		mv4.isDomestic = false;
		mv4.totalScore = 0;
		mv4.tomato = 3.8;
		
		Movie mv5 = new Movie();
		mv5.title = "Mad Max: Fury Road";
		mv5.director = "조지 밀러";
		mv5.isDomestic = false;
		mv4.tomato = 4.2;
	}

}
