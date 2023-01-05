package jdbc;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpDaoEx {

	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
		ed.realSelectAll();
		List<Emp> list = ed.selectAll(0);
//		list.stream().forEach(n->System.out.println(n));
		Map<Integer, List<Emp>> map1 = list.stream().collect(
				
				Collectors.groupingBy(Emp::getDeptno)
				);
		map1.get(30).stream().forEach(n->System.out.println(n));
		
		//
		Map<Integer, Double> map2 = list.stream().collect(
				
				Collectors.groupingBy(Emp::getDeptno, Collectors.averagingDouble(Emp::getSal)
						)
				);
		System.out.println(map2.get(30));
		//
		Map<Integer, String> map3 = list.stream().collect(
				
				Collectors.groupingBy(Emp::getDeptno, Collectors.mapping(Emp::getEname, Collectors.joining(", "))
						)
				);
		System.out.println(map3.get(30));
	}

}
