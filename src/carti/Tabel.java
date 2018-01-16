package carti;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BuildTabel.class)

public class Tabel extends AbstractElement {
	
	private String name="";
	
	public Tabel() {
		
	}
	
	public String getName() {
		return name;
	}
	@JsonSetter("name")
	public void setName(final String name) {
		this.name = name;
	}
	
	public Tabel(final String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name);
	}
	
	public void accept(Visitor v) {
		v.visitTabel();
	}
	
	public String toString() {
		return this.name;
	}
}