package carti;

public class LeftAllign implements AllignStrategy{

	private String text;
	
	public LeftAllign() {
		
	}
	
	public LeftAllign(String text) {
		this.setText(text);
	}
	
	@Override
	public void print(String text) {
		System.out.println("***" + text);
	}

	@Override
	public String toString(String text) {
		return "***" + text;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}