package movie;

public class Spiderman extends Movie{
	public Spiderman(int lateScore) {
		super("스파이더맨: 뉴 유니버스", "로드니 로스맨", "가족/애니메이션/액션", 116, "12세", lateScore);
		this.lateScore = lateScore;
	}

	public void printBriefInfo() {
		System.out.println("올겨울, 스파이더맨들의 새로운 시대가 열린다!");
	}
	
	@Override
	public String toString() {
		return "스파이더맨: 뉴 유니버스\n감독: " + director + "\n장르: " + genre + "\n러닝타임: " + runTime
				+ "\n등급: " + rated + "\n관객수: " + lateScore + "만 명";
	}
}
