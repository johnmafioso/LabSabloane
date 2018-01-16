package carti;

public class DocumentStatisticsVisitor implements Visitor{

	int contorSectiune;
	int contorImageProxy;
	int contorImagine;
	int contorParagraf;
	int contorTabel;
	
	public DocumentStatisticsVisitor() {
		this.contorSectiune = 0;
		this.contorImageProxy = 0;
		this.contorImagine = 0;
		this.contorParagraf = 0;
		this.contorTabel = 0;
	}
	
	public void printStatistics() {
		
		System.out.println("Statistici: Sectiune: " + contorSectiune + " ImageProxy: " + contorImageProxy + " Imagine: " + contorImagine + " Paragraf: " + contorParagraf + " Tabel: " + contorTabel);
	}
	
	
	@Override
	public void visitSectiune() {
		this.contorSectiune++;
		
	}

	@Override
	public void visitImageProxy() {
		this.contorImageProxy++;
		
	}

	@Override
	public void visitImagine() {
		this.contorImagine++;
		
	}

	@Override
	public void visitParagraf() {
		this.contorParagraf++;
		
	}

	@Override
	public void visitTabel() {
		this.contorTabel++;
	}
}