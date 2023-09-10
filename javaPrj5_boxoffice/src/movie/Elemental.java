package movie;

public class Elemental extends Movie {
	public Elemental(int lateScore) {
		super("엘리멘탈", "피터 손", "애니메이션", 109, "전체 연령가", lateScore);
		this.lateScore = lateScore;
	}

	public void printBriefInfo() {
		System.out.println("웰컴 투 ‘엘리멘트 시티’!");
	}
	
	@Override
	public String toString() {
		return "\n감독: " + director + "\n장르: " + genre + "\n러닝타임: " + runTime
				+ "분\n등급: " + rated + "\n관객수: " + lateScore + "만 명";
	}
}
