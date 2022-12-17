package chap06;

public class MemberService {
	String id;
	String password;
	boolean result;
	
	public MemberService() {
		super();
	}
	
	public MemberService(String id) {
		super();
		this.id = id;
	}

	public MemberService(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	
	public boolean login(String id, String password) {
		id = "hong";
		password = "12345";
		if(id.equals("hong") && password.equals("12345")) {
			return result = true;
		} else {
			return result;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}
