package chap13;

public class BoxingEx {
	public static void main(String[] args) {
		Box<String> box = Util.<String>boxing("100");
		System.out.println(box.getT());
	}
}
