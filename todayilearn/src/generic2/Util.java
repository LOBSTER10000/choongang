package generic2;

public class Util {
	public static compare(Pare<K,V> p1, Pare<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getkey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
