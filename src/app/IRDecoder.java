/**
 * 
 */
package app;
import java.util.regex.*;
/**
 * @author Chetan Mahajan
 *
 */
public class IRDecoder {
	
	private static IRDecoder irdecoder;
	
	public static IRDecoder getInstance()
	{
		if(irdecoder==null)
			
		{
			irdecoder=new IRDecoder();
			System.out.println("Creating a new instance of the parser.");
			return irdecoder; 
		}
		else
		{
			System.out.println("Returning an old instrance of the parser.");
			return irdecoder;
		}
	}

	public void readLine(String line) {
		// TODO Auto-generated method stub
		try{
			while(true){
				if(line == null || line == ""){
					
					break;
				}
				else if(validInstructions(line.substring(0,3))){
					
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	private boolean validInstructions(String subline){
		Constants constant = new Constants();
		return false;
		
	}

}
