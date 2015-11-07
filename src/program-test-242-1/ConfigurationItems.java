import java.util.*;
import java.io.*;

public class ConfigurationItems {
	
	public void setTestInputs(String inputs) {
		inputs = inputs.replace(" ", "");
		if(inputs != "") {
			try{
				List<String> inputsList = Arrays.asList(inputs.split(","));
				File inputsFile = 
					new File("C:\\java\\src\\program-test-242-1\\src\\TestInput.txt");
				PrintStream fileStream = new PrintStream(inputsFile);
				for(Iterator<String> i = inputsList.iterator(); i.hasNext(); ) {
					String input = i.next();
					fileStream.println(input);
				}
				fileStream.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}