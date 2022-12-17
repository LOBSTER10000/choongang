package chap06;

public class Memeber {
	String name;
	String id;
	String password;
	int age;
	
	public Memeber(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public Memeber(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Memeber() {
		super();
	}

	public Memeber(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public Memeber(String name) {
		super();
		this.name = name;
	}
	
	
	
}
