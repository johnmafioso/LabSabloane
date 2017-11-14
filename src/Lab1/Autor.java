package Lab1;

public class Autor {

	private String name;
	
	public void setName(final String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public Autor(final String name) {
		
		this.name = name;
	}
	
	public void print() {
		System.out.println(name);
	}
}