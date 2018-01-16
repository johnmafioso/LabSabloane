package carti;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")

public class BuildImagine{

	public BuildImagine() {
		
	}
	
	private String name = "";

	public BuildImagine setName(String name) {
		this.name = name;
		return this;
	}
	
	public Imagine build() {
		return new Imagine(name);
	}
	
	
}