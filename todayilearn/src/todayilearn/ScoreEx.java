package todayilearn;

public class ScoreEx {
	
	public static void main(String[] args) {
//		Student stu = new Student();
//		stu.name = "홍";
//		stu.hakbun = "02";
//		System.out.println(stu);
		// 일반 생성자 생성 후 값 입력

//		Student stu = new Student("홍", "01");
//		System.out.println(stu);
		// 생성자에 값을 입력 후 출력
		
//		Score sco = new Score();
//		sco.eng = 90;
//		sco.math = 95;
//		sco.kor = 100;
//		System.out.println(sco);
		//점수에 일반 생성자 생성후 새롭게 점수 입력
		
//		Score sco = new Score(95, 100, 100);
//		System.out.println(sco);
		// 새롭게 점수의 변수의 생성자를 만들어서 값을 전부 입력
		
//		Student stu = new Student("홍", "02");
//		Score sco = new Score(95, 100, 95);
//		stu.score = sco;
//		System.out.println(stu);
		//학생에 점수값을 새로 입력하여 점수값을 나눠줌
		
		Student stu = new Student("홍", "02");
		Score sco = new Score(95, 100, 95);
		stu.setScore(sco);
		System.out.println(sco);
		stu.updateScore(100, 95, 98);
		System.out.println(sco);
		
		stu.printAll();
		//최종본 완성
	}
	
	
}
