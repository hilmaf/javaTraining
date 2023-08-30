package boxoffice;

public class Movie {
		
	public String title;
	public String director;
	public boolean isDomestic;
	public static int totalScore;
	public double tomato;
	
	
	public static int isScoring(int todayScore) {
		totalScore += todayScore;
		return totalScore;
	}
	
}
