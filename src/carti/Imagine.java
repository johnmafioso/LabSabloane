package carti;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BuildImagine.class)
public class Imagine extends AbstractElement {
	
	private String name="";
	public Imagine() {
		
	}

	public String getName() {
		return name;
	}
	@JsonSetter("name")
	public void setName(final String name) {
		this.name = name;
	} 
	
	public Imagine(final String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name);
	}
	
	public void accept(Visitor v) {
		v.visitImagine();
	}
	
	public String toString() {
		return this.name;
	}
}