package Lab1;

import java.util.ArrayList;

public class Carte {
	
	String titlu;
	ArrayList<Autor> autori = new ArrayList<Autor>();
	ArrayList<Element> continut = new ArrayList<Element>();
	
	public Carte() {
		
	}
	
	public Carte(String titlu) {
		this.titlu = titlu;
	}
	
	public Carte(String titlu, ArrayList<Autor> a) {
		
		this.titlu = titlu;
		this.autori = a;
	}
	
	public void addAutor(Autor a) {
		this.autori.add(a);
	}
	
	public void addElement(Element elem) {
		continut.add(elem);
	}
	
	public void printElements() {
		for(Element elem: this.continut) {
			elem.print();
		}
	}
	
	public void printAutori() {
		for(Autor autor: this.autori) {
			autor.print();
		}
	}
	
	public void print() {
		System.out.println(this.titlu);
		this.printAutori();
		this.printElements();
	}
	
	public static void main(String args[]) {
				
		Carte c  = new Carte("carte1");
		c.addAutor(new Autor("autor1"));
		c.addAutor(new Autor("autor2"));
		c.addElement(new Imagine("picture1.jpg"));
		c.addElement(new Tabel("tabel1"));
		c.print();	
	}
}