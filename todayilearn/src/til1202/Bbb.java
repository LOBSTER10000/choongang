package til1202;

public class Bbb extends Aaa{
	
	public Bbb() {
	}
	
	public Bbb(int x) {
		super(x);
	}
	
	public static void main(String[] args) {
		Aaa aa = new Aaa();
		System.out.println(aa.getX());
	}
}
