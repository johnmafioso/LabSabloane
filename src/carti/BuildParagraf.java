package carti;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")

public class BuildParagraf {

	private String name="";
	private String text="";
	private AllignStrategy allign = null;
	
	
	public BuildParagraf setText(String text) {
		this.text = text;
		return this;
	}

	public BuildParagraf setAllign(AllignStrategy allign) {
		this.allign = allign;
		return this;
	}
	
	public BuildParagraf setName(String name) {
		this.name = name;
		return this;
	}
	
	public Paragraf build(){
		return new Paragraf(name,text,allign);
	}	
}