import java.io.File;
import net.sourceforge.tess4j.*;
	/* Tess4J is a Java wrapper for Tesseract.
	 * http://static.googleusercontent.com/media/research.google.com/pt-BR//pubs/archive/33418.pdf 
	 */

public class CaptchaBreaker{

    public static void main(String[] args) {
    	for(int i = 0; i < 10; i++){
    		File input = new File("_in/" + i + ".jpg");
    		File filteredImage = filterImage(input);
    		ITesseract tesseract = new Tesseract();
    		try{
    			String result = tesseract.doOCR(filteredImage);
    			System.out.println("Input image:" + input.getPath());
    			System.out.println("Text: " + result);
    		}
    		catch(TesseractException error){
    			System.err.println(error.getMessage());
    		}    		
    	}
    }
    
    public static File filterImage(File input){
    	/** TODO */
    	return null;
    }
}