package jdbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamEx1 {

	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
		List<Emp> list = ed.selectAll(0);
//		for(Emp emp : list) {
//			System.out.println(emp);
//		}
		IntStream.rangeClosed(1, 5).forEach(n->{
			
		System.out.println("****");
		System.out.println(n+"test");
		});
		// 필터링
		list.stream()
		.filter(n->n.getEname().startsWith("K"))
		.forEach(n->System.out.println(n));
		System.out.println("-------");
		list.stream()
		.filter(n->n.getSal() >= 2000)
		.forEach(n->System.out.println(n));
	
	//복수 개의 요소로 대체 p802
	
	List<String> inList = Arrays.asList("10, 20, 30", "40, 50, 60");
	inList.stream().flatMapToInt(a -> {
		String[] strArr = a.split(",");
		for(String ss : strArr) { 
			System.out.println(ss);
		}
		int[] intArr = new int[strArr.length];
		for(int i=0; i<strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i].trim());
			}
		return Arrays.stream(intArr);
	})
	.forEach(number -> System.out.println(number));
    System.out.println("------사번으로 정렬-------");
	// 정렬 (sort)
	list.stream().sorted().forEach(n->System.out.println(n));
	
	System.out.println("------부서별, 사번별로 정렬-------");
	list.stream().sorted(Comparator.reverseOrder()) // 역순으로 정렬하라
	.sorted((n1, n2)-> n1.getDeptno()-n2.getDeptno()) // 오름차순으로 정렬
	.forEach(n->System.out.println(n.getEmpno()+","+n.getDeptno())); // empno를 역순으로 deptno를 오름차순으로 정렬하라
	// n1, n2는 sorted의 객체로 n1과 n2의 deptno의 각각의 값을 뺐을때 
	
	System.out.println("----- 루핑으로 평균 구하기-------");
	// 루핑 (peek())
	List<Emp> dept10 = new ArrayList<>();
	double avg = list.stream().filter(a->a.getDeptno()==10)
	.peek(n->dept10.add(n))
	.mapToInt(Emp::getSal)
	.average().getAsDouble();
	dept10.stream().forEach(x->System.out.println(x));
	System.out.println("평균 :" + avg);
	
	System.out.println("-----예외처리------");
	List<Integer> list2 = new ArrayList<>();
	double avg2 = list2.stream()
			.mapToInt(Integer::intValue)
			.average().orElse(0.0);
	System.out.println(avg2);
	
	System.out.println("-----예외처리------");
	
	list2.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a-> System.out.println("평균 : " +a));
	
	System.out.println("-----optional처리----");
	
	OptionalDouble opt = list2.stream()
			.mapToInt(Integer::intValue)
			.average();
	
	if(opt.isPresent()) {
		System.out.println(opt.getAsDouble());
	} else {
		System.out.println("없다");
	}
	
	} //메인 메소드
	
	
}
