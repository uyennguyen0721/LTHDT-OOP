package BaiTap1;

public abstract class Question {
	private String content;
	public Question(String content) {
		this.content = content;
	}
	public String toString() {
		return this.content + "\n";
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
