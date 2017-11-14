package Lab1;

public class ImageProxy extends AbstractElement {

	private String fileName;
	private Imagine realImage = null;
	
	ImageProxy(String fileName){
		this.fileName = fileName;
	}
	
	public void print() {
		
		if(realImage == null) {
			realImage = new Imagine(fileName);
		}
		realImage.print();
	}
}