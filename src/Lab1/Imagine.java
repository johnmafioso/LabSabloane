package Lab1;

public class Imagine extends AbstractElement {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	} 
	
	public Imagine(final String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name);
	}
}