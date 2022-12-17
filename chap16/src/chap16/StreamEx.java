package chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍", "신", "감");
		
		
		Stream<String> st = list.stream();
		st.forEach(n->System.out.print(n + "\t"));
		
		list.stream().forEach(n->System.out.print(n + "\t"));
				
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			System.out.println(name);
//		}
	}
}
