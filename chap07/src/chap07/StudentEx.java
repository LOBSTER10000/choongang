package chap07;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		
		Student stu2 = new Student("네이마르");
		System.out.println(stu2.name);
	}
}
