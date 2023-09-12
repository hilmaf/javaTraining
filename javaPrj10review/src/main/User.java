package main;

public class User {
	
	// constructor	
	public User() {

	}
	public User(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	// 멤버 변수
	private String id;
	private String pwd;
	
	// getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + "]";
	}
	
	
}
