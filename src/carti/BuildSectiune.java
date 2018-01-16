package carti;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")

public class BuildSectiune {

	private String titlu="";
	private ArrayList<Element> elems = new ArrayList<Element>();
	
	public BuildSectiune setTitlu(String titlu) {
		this.titlu = titlu;
		return this;
	}
	
	public BuildSectiune setElems(ArrayList<Element> elems) {
		this.elems = elems;
		return this;
	}
	
	public Sectiune build() {
		return new Sectiune(titlu,elems);
	}	
}