package testWeb;

import java.util.ArrayList;
import java.util.List;

public class StudentEx {

	public static void main(String[] args) {
		List<Student> stu = new ArrayList<Student>();
		Student stu1 = new Student(1, "이름", "학번", "주소");
		
		stu.add(stu1);
		System.out.println(stu);
		
		stu.add(new Student(2, "이름2", "학번2", "주소2"));
		stu.add(new Student(3, "이름3", "학번3", "주소3"));
		stu.add(new Student(4, "이름4", "학번4", "주소4"));
		
		for(Student st : stu) {
			System.out.println(st);
		}
	}

}
