package chap14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigconsumer = (t,u) -> System.out.println(t + u);
		bigconsumer.accept("jdbc", "9");
	}

}
