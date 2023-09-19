package board;

public class BoardData {
	
	private String title;
	private String author;
	private String content;
	
	// constructor
	public BoardData() {
		
	}
	
	public BoardData(String title, String author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	// getter/setter
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	
	// toString
	@Override
	public String toString() {
		return "BoardData : [Title] " + title + " [Content] " + content + " [Author] " + author;
	}
	
	
}
