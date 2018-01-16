package carti;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BuildParagraf.class)

public class Paragraf extends AbstractElement {
	
	private String name="";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String text="";
	private AllignStrategy allign = null;
	
	public Paragraf() {
		
	}

	public String getText() {
		return text;
	}
	@JsonSetter("text")
	public void setText(final String text) {
		this.text = text;
	}
	
	public Paragraf(final String text) {
		this.text = text;
	}
	
	public Paragraf(String name, String text) {
		this.name = name;
		this.text = text;
	}

	public Paragraf(String name, String text3, AllignStrategy allign2) {
		this.name = name;
		this.text = text3;
		this.allign = allign2;
	}

	public void print() {	
		if(allign == null)
			System.out.println(this.name + " " + text);
		else {
			System.out.println(this.name + " " + text);
			allign.print(text);
		}
	}

	public void setAllign(AllignStrategy allign) {
		this.allign = allign;
	}
	
	public void accept(Visitor v) {
		v.visitParagraf();
	}
	
	public String toString() {
		return this.text;
	}
}