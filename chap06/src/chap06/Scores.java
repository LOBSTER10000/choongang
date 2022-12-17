package chap06;

public class Scores {
	private int kor;
	private int math;
	private int eng;
	
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	int sum() {
		return kor+math+eng;
	}
	
	double avg() {
		return (double) sum() / 3; 
	}
	
	public Scores(int kor, int math, int eng) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Scores [kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
}
