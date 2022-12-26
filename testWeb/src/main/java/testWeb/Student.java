package testWeb;

public class Student {
	private int id;
	private String name;
	private String hakbun;
	private String addr;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	
	public Student() {
		
	}
	public Student(int id, String name, String hakbun, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.hakbun = hakbun;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", hakbun=" + hakbun + ", addr=" + addr + "";
	}
	
	
}
