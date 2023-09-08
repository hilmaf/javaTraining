package movie;

public abstract class Movie {
	
	public static String Name01 = "엘리멘탈";
	public static String Name02 = "밀수";
	public static String Name03 = "오펜하이머";
	public static String Name04 = "스파이더맨: 뉴 유니버스";
	
	public Movie(String name, String director, String genre, int runTime, String rated, int lateScore) {
		this.name = name;
		this.director = director;
		this.genre = genre;
		this.runTime = runTime;
		this.rated = rated;
		this.lateScore = lateScore;
	}

//	멤버변수
	protected String name;
	protected String director;
	protected String genre;
	protected int runTime;
	protected String rated;
	protected int lateScore;
	
//	멤버메소드
	public abstract void printBriefInfo();
	
	public void scoreRanking() {
		
	}

	public void calLateScore() {
		
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public String getDirector() {
		return director;
	}

	public String getGenre() {
		return genre;
	}

	public int getRunTime() {
		return runTime;
	}

	public String getRated() {
		return rated;
	}

	public int getLateScore() {
		return lateScore;
	}

	public void setLateScore(int lateScore) {
		this.lateScore = lateScore;
	}

	//toString
	@Override
	public String toString() {
		return "Movie [name=" + name + ", director=" + director + ", genre=" + genre + ", runTime(min)=" + runTime
				+ ", rated=" + rated + ", lateScore=" + lateScore + "]";
	}
}
