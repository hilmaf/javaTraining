package movie;

public class Oppenheimer extends Movie {
	public Oppenheimer(int lateScore) {
		super("오펜하이머", "크리스토퍼 놀란", "드라마/스릴러", 180, "15세이상", lateScore);
		this.lateScore = lateScore;
	}

	public void printBriefInfo() {
		System.out.println("나는 이제 죽음이요, 세상의 파괴자가 되었다.");
	}

	@Override
	public String toString() {
		return "오펜하이머\n감독: " + director + "\n장르: " + genre + "\n러닝타임: " + runTime
				+ "\n등급: " + rated + "\n관객수: " + lateScore + "명";
	}
}
