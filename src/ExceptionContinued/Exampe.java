package ExceptionContinued;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exampe {
	
	
	String readFromFile() throws FileNotFoundException {
		File f = new File("");
			FileReader fr = new FileReader(f);
		
		return "test";
	}
	
	public static void main(String[] args) {
		Exampe e = new Exampe();
		
	}

}
