package functions;

import java.io.File;
import utilities.Utility;

public class DeleteFile extends Utility {

	protected void delete() {
		String fileName = handleUserInput();
		File file = new File(DIRECTORY + "\\" + fileName);

		if(file.delete()) System.out.println("File deletion successful\n");
		else System.out.println("Unable to delete file, please make sure file name is correct");

	}
}
