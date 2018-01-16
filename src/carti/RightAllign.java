package carti;

public class RightAllign implements AllignStrategy {
	
	private String text;
	
	public RightAllign() {
	}
	
	public RightAllign(String text) {
		this.text = text;
	}

	@Override
	public void print(String text) {
		System.out.println(text + "***");
	}
	
	@Override
	public String toString(String text) {
		return text + "***";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}