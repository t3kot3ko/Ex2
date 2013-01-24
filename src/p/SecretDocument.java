package p;

public class SecretDocument {
	// private fields 
	private String title;
	private String text;
	private String authorName;
	
	
	private int secretPage;
	private int secretWord;
	private int secretCharacter;
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
	public int getSecretPage() {
		return secretPage;
	}
	public void setSecretPage(int secretPage) {
		this.secretPage = secretPage;
	}
	public int getSecretWord() {
		return secretWord;
	}
	public void setSecretWord(int secretWord) {
		this.secretWord = secretWord;
	}
	public int getSecretCharacter() {
		return secretCharacter;
	}
	public void setSecretCharacter(int secretCharacter) {
		this.secretCharacter = secretCharacter;
	}

}
