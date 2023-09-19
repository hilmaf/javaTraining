package board;

public class BoardData {
	
	private String title;
	private String content;
	private String author;
	
	// constructor
	public BoardData() {
		
	}
	
	public BoardData(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	// getter/setter
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
	
	public void setAuthor() {
		this.author = author;
	}
	
	// toString
	@Override
	public String toString() {
		return "BoardData : [Title] " + title + " [Content] " + content + " [Author] " + author;
	}
	
	
}
