package member.console;

public class Member {
	
	String id;
	String pwd;
	String nick;
	
	public Member() {

	}
	
	
	public Member(String id, String pwd, String nick) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}


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


	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", nick=" + nick + "]";
	}
	
	
}
