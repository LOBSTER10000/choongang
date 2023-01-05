package collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListEx {

	public static void main(String[] args) {
		List<Student> totalList =Arrays.asList( 
				new Student("홍", 11, Student.Sex.MALE),
				new Student("김", 7, Student.Sex.FEMALE),
				new Student("신", 10, Student.Sex.MALE),
				new Student("박", 6, Student.Sex.FEMALE)
				);
		// ArrayList와 Arrays.asList()의 차이는 어레이리스트는 새로 선언 후add라는 메소드를 사용하여 입력해줘야하지만
		// arrays.asList의 경우에는 새로 선언하지 않고 내부에 메소드 기능을 사용해 바로 안에 입력하는 것이 가능하다.
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s->System.out.println(s.getName()));
		
		//여학생들만 묶어 Hashset 생성
		Set<Student> femaleSet = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new));
		femaleSet.stream().forEach(s->System.out.println(s.getName()));
	}

}
