package functions;
import java.io.File;
import java.io.IOException;

import utilities.Utility;

public class AddFile extends Utility {

	protected void add(String _fileName, String _directory) {
		File file = new File(_directory + "\\" + _fileName);
		try {
			
			if(file.createNewFile()) System.out.println("File creation successful\n");
			else System.out.println("Unable to create file, please make sure file name is unique.");
			
		} catch (IOException e) {
			Logger.error("Error creating file");
		}
	}
}
