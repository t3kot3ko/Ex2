package p;

public class PublicDocument {
	// private fields 
	private String title;
	private String text;
	private String authorName;
	
	private int publicpage;
	private int publicword;
	private int publiccharacter;
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
	public int getPublicpage() {
		return publicpage;
	}
	public void setPublicpage(int publicPage) {
		this.publicpage = publicPage;
	}
	public int getPublicword() {
		return publicword;
	}
	public void setPublicword(int publicWord) {
		this.publicword = publicWord;
	}
	public int getPubliccharacter() {
		return publiccharacter;
	}
	public void setPubliccharacter(int publicCharacter) {
		this.publiccharacter = publicCharacter;
	}
	public int getReferred() {
		return referred;
	}
	public void setReferred(int referred) {
		this.referred = referred;
	}
	
}
