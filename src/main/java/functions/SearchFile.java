package functions;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import utilities.Utility;

public class SearchFile extends Utility {

	public void search() {
		String fileName = handleUserInput();
		File directory = new File(DIRECTORY);
		List<String> list = Arrays.asList(directory.list());
		
		if(list.stream().anyMatch(n -> n.equals(fileName))) {
			System.out.println("File found");
		}
		else System.out.println("File not found");
	}
}
