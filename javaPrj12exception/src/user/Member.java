package user;

public class Member {
	
	
	// constructor
	public Member() {

	}

	public Member(String id, String pwd, String nick) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}



	// 멤버 변수
	private String id;
	private String pwd;
	private String nick;
	
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
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	// toString
	@Override
	public String toString() {
		return "아이디: " + id + " 비밀번호: " + pwd + " 닉네임: " + nick;
	}
	
	
	
}
