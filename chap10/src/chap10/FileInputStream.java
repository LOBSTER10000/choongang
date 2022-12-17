package chap10;

public class FileInputStream implements AutoCloseable{
	private String file;

	public FileInputStream(String file) {
		super();
		this.file = file;
	}
	public void read() {
		System.out.println(file + "읽기");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file + "닫기");
	}
}
