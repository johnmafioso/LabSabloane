package carti;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")

public class BuildTabel {
	
	public BuildTabel() {
		
	}
	
	private String name = "";

	public BuildTabel setName(String name) {
		this.name = name;
		return this;
	}
	
	public Tabel build() {
		return new Tabel(name);
	}
}