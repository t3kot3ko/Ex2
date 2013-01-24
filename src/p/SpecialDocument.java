package p;

public class SpecialDocument {
	// private fields 
	private String title;
	private String text;
	private String authorName;
	
	private int specialPage;
	private int specialWord;
	private int specialCharacter;
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
	public int getSpecialPage() {
		return specialPage;
	}
	public void setSpecialPage(int specialPage) {
		this.specialPage = specialPage;
	}
	public int getSpecialWord() {
		return specialWord;
	}
	public void setSpecialWord(int specialWord) {
		this.specialWord = specialWord;
	}
	public int getSpecialCharacter() {
		return specialCharacter;
	}
	public void setSpecialCharacter(int specialCharacter) {
		this.specialCharacter = specialCharacter;
	}
	public int getReferred() {
		return referred;
	}
	public void setReferred(int referred) {
		this.referred = referred;
	}
	
}
