package Lab1;

import java.util.Vector;

public class Cuprins {

	private Vector<String> names = new Vector<String>();

	public Vector<String> getNames() {
		return names;
	}

	public void setNames(Vector<String> names) {
		this.names = names;
	}
	
	public void addName(final String name) {
		this.names.addElement(name);
	}
	
	public Cuprins(final Vector<String> names) {
		this.names = names;
	}
}