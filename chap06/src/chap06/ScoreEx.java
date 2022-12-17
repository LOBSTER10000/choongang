package chap06;

public class ScoreEx {

	public static void main(String[] args) {
		Student stu = new Student("홍", "01");

//		Student stu = new Student();
//		stu.name = "홍";
//		stu.hakbun = "01";
		Scores sco = new Scores(89, 91, 88);

//		Scores sco = new Scores();
// 		현재 클래스의 Scores의 값을 
//		불러오지 않아서 Scores의 클래스를 불러옴(Student에도 있음)

//		sco.kor = 89;
//		sco.math = 91;
//		sco.eng = 88;
		
//		stu.scores = sco; // 스튜던트의 점수를 스코어 점수를 주입함
		
		stu.setScores(sco); // setter를 이용하여 새로운 매개변수를 만들어줌.
		
//		stu.setScores(new Scores(89, 91, 88));
		System.out.println(stu);
		
		
		stu.id();
		stu.updateScore(90, 90, 90);
		stu.setScores(sco);
		System.out.println(sco);
	}

}
