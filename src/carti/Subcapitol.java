package Lab1;

import java.util.ArrayList;

public class Subcapitol implements InfosCapitole {

	private int number;
	private String name;
	
	public ArrayList<Element> elements = new ArrayList<Element>();
	
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
	
	public Subcapitol() {
		
	}
	
	public Subcapitol(final int number, final String name) {
		this.name = name;
		this.number = number;
	}
	
	public Subcapitol(final int number) {
		this.name = "";
		this.number = number;
	}
	
	public Subcapitol(final String name) {
		this.name = name;
		this.number = 0;
	}
}