package carti;

public class Autor {

	private String name;
	
	public Autor() {
		
	}
	
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
	
	public String toString() {
		return this.name;
	}
}