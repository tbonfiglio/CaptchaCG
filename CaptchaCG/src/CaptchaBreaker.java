import java.io.File;
import net.sourceforge.tess4j.*;

public class CaptchaBreaker{

    public static void main(String[] args) {
    	for(int i = 0; i < 10; i++){
    		File image = new File("_in/" + i + ".jpg");
    		/** TODO: Filters */
    		ITesseract tesseract = new Tesseract();
    		try{
    			String result = tesseract.doOCR(image);
    			System.out.println(result);
    		}
    		catch(TesseractException error){
    			System.err.println(error.getMessage());
    		}    		
    	}
    }
}