package p;

public class SpecialDocument {
	// private fields 
	private String title;
	private String text;
	private String authorName;
	
	private int specialpage;
	private int specialword;
	private int specialcharacter;
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
	public int getSpecialpage() {
		return specialpage;
	}
	public void setSpecialpage(int specialPage) {
		this.specialpage = specialPage;
	}
	public int getSpecialword() {
		return specialword;
	}
	public void setSpecialword(int specialWord) {
		this.specialword = specialWord;
	}
	public int getSpecialcharacter() {
		return specialcharacter;
	}
	public void setSpecialcharacter(int specialCharacter) {
		this.specialcharacter = specialCharacter;
	}
	public int getReferred() {
		return referred;
	}
	public void setReferred(int referred) {
		this.referred = referred;
	}
	
}
