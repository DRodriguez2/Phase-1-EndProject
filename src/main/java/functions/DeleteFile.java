package functions;

import java.io.File;
public class DeleteFile {

	protected void delete(String _fileName, String _directory) {
		File file = new File(_directory + "\\" + _fileName); // for windows machines

		if(file.delete()) System.out.println("File deletion successful\n");
		else System.out.println("Unable to delete file, please make sure file name is correct");

	}
}
