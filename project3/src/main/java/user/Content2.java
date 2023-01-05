package user;
public class Content2 implements Comparable<Content2>{
	private String title;
	private String content;
	private String userID;
	private String date;
	
	public Content2(String title, String content, String userID,String date) {
		super();
		this.title = title;
		this.content = content;
		this.userID = userID;
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserID() {
		return userID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	@Override
	public int compareTo(Content2 o) {
		int a = Integer.parseInt(date);
		int b = Integer.parseInt(o.date);
		if(a < b) {return 1;}
		else if(a == b) {return 0;}
		else {return -1;}
	}
}
