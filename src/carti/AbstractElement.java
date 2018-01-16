package carti;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"elems"}) 

public abstract class AbstractElement implements Element {
	
	private String name="";
	private ArrayList<Element> elems = new ArrayList<Element>();
	
	public ArrayList<Element> getElems() {
		return elems;
	}
	
	public void setElems(ArrayList<Element> elems) {
		this.elems = elems;
	}

	@Override
	public void add(Element e) {
		this.elems.add(e);
	}

	@Override
	public void remove(Element e) {
		this.elems.remove(e);
	}

	@Override
	public Element getElement(int i) {
		return this.elems.get(i);
	}

	@Override
	public Element getElement() {
		return null;
	}

	@Override
	public void print() {
		for(Element e:elems) {
			e.print();
		}
	}
	
	@Override
	public void accept(Visitor v) {
		for(Element e:elems) {
			e.accept(v);
		}
	}
	
	public String toString() {
		return this.elems.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}