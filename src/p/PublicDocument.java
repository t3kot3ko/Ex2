package p;

public class PublicDocument {
	// private fields 
	private String title;
	private String text;
	private String authorName;
	
	private int publicPage;
	private int publicWord;
	private int publicCharacter;
	private int referred;
	
	
	
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
	public int getPublicPage() {
		return publicPage;
	}
	public void setPublicPage(int publicPage) {
		this.publicPage = publicPage;
	}
	public int getPublicWord() {
		return publicWord;
	}
	public void setPublicWord(int publicWord) {
		this.publicWord = publicWord;
	}
	public int getPublicCharacter() {
		return publicCharacter;
	}
	public void setPublicCharacter(int publicCharacter) {
		this.publicCharacter = publicCharacter;
	}
	public int getReferred() {
		return referred;
	}
	public void setReferred(int referred) {
		this.referred = referred;
	}
	
}
