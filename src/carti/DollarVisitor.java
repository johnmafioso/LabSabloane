package carti;

public class DollarVisitor implements Visitor {
	

	int pretImagine;
	int pretParagraf;
	int pretTabel;


	@Override
	public void visitImagine() {
		this.pretImagine += 10;
		
	}

	@Override
	public void visitParagraf() {
		this.pretParagraf += 5;
		
	}

	@Override
	public void visitTabel() {
		this.pretTabel += 3;
		
	}
	
	public void printDollars() {
		System.out.println("Price: Imagine: " + pretImagine + "$ Paragraf: " + pretParagraf + "$ Tabel: " + pretTabel + "$");
	}

	@Override
	public void visitSectiune() {
		
		
	}

	@Override
	public void visitImageProxy() {
	
		
	}

}
