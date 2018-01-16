package carti;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AbstractElement.class)

public interface Element{
	
	public void add(Element e);
	public void remove(Element e);
	public Element getElement(int i);
	public Element getElement();
	public void print();
	public String toString();
	public void accept(Visitor v);
}