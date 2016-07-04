import java.io.File;
import net.sourceforge.tess4j.*;

public class CaptchaBreaker{

    public static void main(String[] args) {
    	for(int i = 0; i < 10; i++){
    		
    	}
    	
    	
        File imageFile = new File("eurotext.tif");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}