package Lab1;

import java.util.ArrayList;

public class Sectiune implements Element{
	
	String titlu;
	ArrayList<Element> elems = new ArrayList<Element>();
	
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
		return elems.get(0);
	}

	@Override
	public void print() {
		System.out.println(elems);
	}
}