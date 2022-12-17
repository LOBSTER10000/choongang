package todayilearn;

public class Score {
	private int kor;
	private int math;
	private int eng;
	
	// private를 사용하여 그 바로 접근을 하지 못하게함
	// 접근을 하기 위해서는 getter / setter 메소드를 이용해만 접근 가능
	
	public void printSum() {
		System.out.println(sum());
	}
	public double avg() {
		return sum() / 3;
	}
	
	public int sum() {
		return kor+math+eng;
	}
	
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


	public Score(int kor, int math, int eng) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public Score() {
		
	}


	@Override
	public String toString() {
		return "Score [kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	
	
	
}
