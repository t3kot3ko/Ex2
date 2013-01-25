package p;

public class SecretDocument {
	// private fields 
	private String title;
	private String text;
	private String authorName;
	
	
	private int secretpage;
	private int secretword;
	private int secretcharacter;
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
	public int getReferred() {
		return referred;
	}
	public void setReferred(int referred) {
		this.referred = referred;
	}
	public int getSecretpage() {
		return secretpage;
	}
	public void setSecretpage(int secretPage) {
		this.secretpage = secretPage;
	}
	public int getSecretword() {
		return secretword;
	}
	public void setSecretword(int secretWord) {
		this.secretword = secretWord;
	}
	public int getSecretcharacter() {
		return secretcharacter;
	}
	public void setSecretcharacter(int secretCharacter) {
		this.secretcharacter = secretCharacter;
	}

}
