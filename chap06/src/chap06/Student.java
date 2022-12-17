package chap06;

public class Student {
		String name;
		String hakbun;
		Scores scores;
		
		
		void updateScore(int kor, int math, int eng) {
//			scores.kor = kor;
//			scores.math = math;
//			scores.eng = eng;
			
			scores.setKor(kor);
			scores.setMath(math);
			scores.setEng(eng);
		}
		
		public void id() {
			System.out.println("Student [name=" + name + "]");
			System.out.println("Student [hakbun=" + hakbun + "]" );
			System.out.println("Student [scores=" + scores + "]");
			System.out.println("Student [sum=" + scores.sum() + "]");
			System.out.println("Student [avg=" + scores.avg() + "]");
		}
		
		public Scores getScores() {
			return scores;
		}

		public void setScores(Scores scores) {
			this.scores = scores;
		} 
		
		// getter / setter를 만든다. 세터를 통해서 매개변수를 통해서 클래스 타입을 넣어줌

		public Student(String name, String hakbun, Scores scores) {
			super();
			this.name = name;
			this.hakbun = hakbun;
			this.scores = scores;
		}

		public Student(String name, String hakbun) {
			super();
			this.name = name;
			this.hakbun = hakbun;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", hakbun=" + hakbun + ", scores=" + scores + "]";
		}
}
