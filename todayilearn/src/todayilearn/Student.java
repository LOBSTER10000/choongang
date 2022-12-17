package todayilearn;

public class Student {
	String name;
	String hakbun;
	private Score scores;
	
	public void printAll() {
		System.out.println("Student [name=" + name + ", hakbun=" + hakbun + ", score=" + scores + "]");
		System.out.println("총점" + scores.sum());
		System.out.println("평균" + scores.avg());
	}
	
	public Score getScore() {
		return scores;
	}


	public void setScore(Score score) {
		this.scores = score;
	}


	void updateScore(int kor, int math, int eng) {
//		this.kor = kor;
//		this.math = math;
//		this.eng = eng;
		scores.setKor(kor);
		scores.setMath(math);
		scores.setEng(eng);
	}
	
	
	public Student(String name, String hakbun, Score score) {
		this.name = name;
		this.hakbun = hakbun;
		this.scores = score;
	}

	public Student(String name, String hakbun) {
		super();
		this.name = name;
		this.hakbun = hakbun;
	}
	
	

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", score=" + scores + "]";
	}
	
	
	
}
