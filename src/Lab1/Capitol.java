package Lab1;

public class Capitol implements InfosCapitole {

	private int number;
	private String name;
	
	public void setNumber(final int number) {
		this.number = number;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return this.number; 
	}
	
	public String getName() {
		return this.name;
	}
	
	public Capitol(final int number, final String name) {
		this.name = name;
		this.number = number;
	}
	
	public Capitol(final int number) {
		this.name = "";
		this.number = number;
	}
	
	public Capitol(final String name) {
		this.name = name;
		this.number = 0;
	}
}
