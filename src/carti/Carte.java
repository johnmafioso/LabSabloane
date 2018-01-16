package carti;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Carte {
	
	private String titlu="";
	private ArrayList<Autor> autori = new ArrayList<Autor>();
	private ArrayList<Element> continut = new ArrayList<Element>();
	
	public Carte() {
		
	}
	
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autor> autori) {
		this.autori = autori;
	}

	public ArrayList<Element> getContinut() {
		return continut;
	}

	public void setContinut(ArrayList<Element> continut) {
		this.continut = continut;
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
	
	public String toString() {
		return this.titlu + " " + this.autori + " " + this.continut;
	}
	
	public void accept(Visitor v) {
		for(Element elem:continut) {
			elem.accept(v);
		} 
	}
	
	public static void main(String args[]) throws IOException {
				
		Carte c  = new Carte();
		Paragraf paragraf = new Paragraf("paragraf1","thisText");
		ArrayList<Element> elemSectiune = new ArrayList<Element>();
		elemSectiune.add(new Imagine("imagineSectiune.jpg"));
		Sectiune sectiune = new Sectiune("sectiune1",elemSectiune);
		c.setTitlu("carte1");
		c.addAutor(new Autor("autor1"));
		c.addAutor(new Autor("autor2"));
		c.addElement(new Imagine("picture1.jpg"));
		c.addElement(new Tabel("tabel1"));
		c.addElement(new Tabel("tabel2"));
		c.addElement(paragraf);
		c.addElement(sectiune);
		LeftAllign la  = new LeftAllign();
		paragraf.setAllign(la);
		paragraf.print();
		c.print();	
		//Statistici
		DocumentStatisticsVisitor ds = new DocumentStatisticsVisitor();
		DollarVisitor dds = new DollarVisitor();
		c.accept(ds);
		c.accept(dds);
		ds.printStatistics();
		dds.printDollars();
		//XML
		try {
			SaveVisitor.serializeToXML(c);
			System.out.println("XML");
			System.out.println(SaveVisitor.deserializeFromXML());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// JSON
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.enableDefaultTyping();
		System.out.println("JSON");
		File file = new File("carte.json");
		try {
				mapper.writeValue(file, c);
		} catch (IOException e) {
				e.printStackTrace();
		}
		try {
				Carte newCarte = mapper.readValue(file, Carte.class);
				System.out.println(newCarte.toString());
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
}