package carti;

public class ContentAllign implements AllignStrategy {
	
	private String text;
	
	public ContentAllign() {
	}

	public ContentAllign(String text) {
		this.text = text;
	}
	
	@Override
	public void print(String text) {
		System.out.println("***" + text + "***");
	}
	
	public String toString(String text) {
		return "***" + text + "***";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}