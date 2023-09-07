package movie;

public class Elemental extends Movie {
	public Elemental(int lateScore) {
		super("엘리멘탈", "피터 손", "애니메이션", 109, "전체연령가", lateScore);
		this.lateScore = lateScore;
	}

	public void printBriefInfo() {
		System.out.println("웰컴 투 ‘엘리멘트 시티’!");
	}
}
