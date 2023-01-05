package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListEx2 {
	
	public static void main(String[] args) {
		List<Student> tt2 = new ArrayList<>();
		tt2.add(new Student("홍", 10, Student.Sex.MALE, Student.City.Seoul));
		 //= 아래와 같은 의미다.
		List<Student> totalList =Arrays.asList( 
				new Student("홍", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김", 6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("신", 10, Student.Sex.MALE, Student.City.Pusan),
				new Student("박", 6, Student.Sex.FEMALE, Student.City.Seoul)
				);
		// ArrayList와 Arrays.asList()의 차이는 어레이리스트는 새로 선언 후add라는 메소드를 사용하여 입력해줘야하지만
		// arrays.asList의 경우에는 새로 선언하지 않고 내부에 메소드 기능을 사용해 바로 안에 입력하는 것이 가능하다.
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex));
		// 맵은 키, 밸류로 나눠짐 (각자 성별별로 리스트를 정렬하라는 의미를 지닌다
		System.out.println("[남학생]");
		mapBySex.get(Student.Sex.MALE).stream()
		.forEach(n->System.out.println(n.getName() + ", " + n.getCity() + " "));
		
		System.out.println("[여학생]");
		mapBySex.get(Student.Sex.FEMALE).stream()
		.forEach(n->System.out.println(n.getName() + ", " + n.getCity() + " "));
		
		////////////////////////////////////////////////////////////////////////
		Map<Student.City, List<Student>> mapByCity = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity));
		System.out.println("[부산]");
		mapByCity.get(Student.City.Pusan).stream()
		.forEach(n->System.out.println(n.getName() + ", " + n.getCity() + " "));
		
		System.out.println("[서울]");
		mapByCity.get(Student.City.Seoul).stream()
		.forEach(n->System.out.println(n.getName() + ", " + n.getCity() + " "));
		//////////////////////////////////////////////////////////////////////
		
		Map<Student.City, List<String>> mapByCity2 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity,
						Collectors.mapping(Student::getName, Collectors.toList())));
		System.out.println("[부산]");
		mapByCity2.get(Student.City.Pusan).stream()
		.forEach(n->System.out.println(n));
		
		
		/////////////////////////////////////////////////////////////////
		//평균 구하기
		
		Map<Student.Sex, Double> ms1 = totalList.stream()
				.collect(Collectors.groupingBy(
						 Student::getSex,
						 Collectors.averagingDouble(Student::getScore)
						)
					);
		System.out.println("[여성 평균]");
		System.out.println(ms1.get(Student.Sex.FEMALE));
		
		Map<Student.City, Double> ms2 = totalList.stream()
				.collect(Collectors.groupingBy(
						 Student::getCity,
					Collectors.averagingDouble(Student::getScore)
						)
					);
		System.out.println("[서울 평균]");
		System.out.println(ms2.get(Student.City.Seoul));
	}
}
