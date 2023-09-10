package movie;

public class Smugglers extends Movie {
	public Smugglers(int lateScore) {
		super("밀수", "류승완", "범죄", 129, "15세 이상", lateScore);
		this.lateScore = lateScore;
	}

	public void printBriefInfo() {
		System.out.println("물길을 아는 자가 돈길의 주인이 된다!");
	}
	
	@Override
	public String toString() {
		return "\n감독: " + director + "\n장르: " + genre + "\n러닝타임: " + runTime
				+ "분\n등급: " + rated + "\n관객수: " + lateScore + "만 명";
	}
}
