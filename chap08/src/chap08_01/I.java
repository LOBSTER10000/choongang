package chap08_01;

public interface I {
	default void d() {
		System.out.println("d");
	}
}
