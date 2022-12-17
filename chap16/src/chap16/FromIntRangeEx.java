package chap16;

import java.util.stream.IntStream;

public class FromIntRangeEx {
	public static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IntStream stream = IntStream.rangeClosed(1, 100);
//		stream.forEach(a -> sum += a);
//		System.out.println(sum);
		
		IntStream.rangeClosed(1, 10).forEach(a-> sum+= a);
		System.out.println(sum);
	}

}
