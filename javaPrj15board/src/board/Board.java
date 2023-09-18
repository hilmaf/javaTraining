package board;

public class Board {
	
	//멤버변수
	private String title;
	private String content;
	private String author;
	
	//constructor
	public Board() {
		
	}
	
	public Board(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	// getter setter
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// toString
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", author=" + author + "]";
	}
	
	
}
