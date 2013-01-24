package p;

public class PDFDocument {
	// private fields 
	private String title;
	private String text;
	private String authorName;
	
	private int page;
	private int word;
	private int character;
	private int referred;
	
	// accessors
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getWord() {
		return word;
	}
	public void setWord(int word) {
		this.word = word;
	}
	public int getCharacter() {
		return character;
	}
	public void setCharacter(int character) {
		this.character = character;
	}
	public int getReferred() {
		return referred;
	}
	public void setReferred(int referred) {
		this.referred = referred;
	}

}
