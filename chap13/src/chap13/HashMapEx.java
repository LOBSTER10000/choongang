package chap13;

import java.util.Map;
import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("신", 85);
		map.put("권", 90);
		map.put("동", 90);
		map.put("홍", 100);
		System.out.println(map.get("권"));
		
		// map은 키와 밸류값으로 나눠짐  키는 중복이 불가하지만 밸류값은 중복 허용 가능
	}

}
