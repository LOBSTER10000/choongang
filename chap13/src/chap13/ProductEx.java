package chap13;

public class ProductEx {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 tv");
		Tv tv = product1.getKind();
		String tvmodel = product1.getModel();

	}

}
