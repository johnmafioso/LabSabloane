package carti;

import java.util.ArrayList;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BuildSectiune.class)

public class Sectiune implements Element{
	
	private String titlu="";
	private ArrayList<Element> elems = new ArrayList<Element>();
	
	public Sectiune() {
		
	}
	
	public Sectiune(String titlu2, ArrayList<Element> elems2) {
		this.titlu = titlu2;
		this.elems = elems2;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Element> getElems() {
		return elems;
	}

	public void setElems(ArrayList<Element> elems) {
		this.elems = elems;
	}

	@Override
	public void add(Element e) {
		elems.add(e);
	}
	
	@Override
	public void remove(Element e) {
		elems.remove(e);
	}

	@Override
	public Element getElement(int i) {
		return elems.get(i);
	}

	@Override
	public Element getElement() {
		return null;
	}

	@Override
	public void print() {
		System.out.println(this.titlu + " " + elems);
	}

	@Override
	public void accept(Visitor v) {
		v.visitSectiune();
	}
	
	public String toString() {
		return this.titlu;
	}
}