import java.io.File;
import net.sourceforge.tess4j.*;

public class CaptchaBreaker{

    public static void main(String[] args) {
    	for(int i = 0; i < 10; i++){
    		File input = new File("_in/" + i + ".jpg");
    		File filteredImage = filterImage(input);
    		ITesseract tesseract = new Tesseract();
    		try{
    			String result = tesseract.doOCR(filteredImage);
    			System.out.println(result);
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