package chap13;

import java.util.ArrayList;
import java.util.List;

public class ListEx extends Object {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<Integer>();  //<>안에는 클래스/인터페이스 타입을 적는 것을 1순위로 삼는다
		list2.add(33);
		list2.add(44);
		System.out.println(list2);
		
		List list = new ArrayList();
		list.add("hello");
		list.add(3.14);
		list.add(1);
		String str = (String) list.get(0);
		Object obj = list.get(0);
		System.out.println(list);
	}

}
