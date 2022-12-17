package chap10;

public class WrapperEx {
	public static void main(String[] args) {
		int x = 10;
		Integer y = new Integer(x);
		Integer y1 = x;
		System.out.println(x == y);
		System.out.println(x == y1);
		int z = Integer.parseInt("123w");
		System.out.println(z);
		int p = Integer.valueOf("123");
		System.out.println(p);
	}
}
