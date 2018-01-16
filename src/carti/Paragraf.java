package Lab1;

public class Paragraf extends AbstractElement {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		this.text = text;
	}
	
	public Paragraf(final String text) {
		this.text = text;
	}

	public void print() {
		System.out.println(text);
	}
}