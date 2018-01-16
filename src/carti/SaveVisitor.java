package carti;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveVisitor {
	
	public static void serializeToXML (Carte carte) throws IOException {
	        FileOutputStream fos = new FileOutputStream("carte.xml");
	        XMLEncoder encoder = new XMLEncoder(fos);
	        encoder.setExceptionListener(new ExceptionListener() {
	                public void exceptionThrown(Exception e) {
	                    System.out.println("Exception! :"+e.toString());
	                }
	        });
	        encoder.writeObject(carte);
	        encoder.close();
	        fos.close();
	    }
	     
	    public static Carte deserializeFromXML() throws IOException {
	        FileInputStream fis = new FileInputStream("carte.xml");
	        XMLDecoder decoder = new XMLDecoder(fis);
	        Carte decodedCarte = (Carte) decoder.readObject();
	        decoder.close();
	        fis.close();
	        return decodedCarte;
	    }
}