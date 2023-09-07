package movie;

public class Smugglers extends Movie {
	public Smugglers(int lateScore) {
		super("밀수", "류승완", "범죄", 129, "15세이상", lateScore);
		this.lateScore = lateScore;
	}

	public void printBriefInfo() {
		System.out.println("물길을 아는 자가 돈길의 주인이 된다!");
	}
}
