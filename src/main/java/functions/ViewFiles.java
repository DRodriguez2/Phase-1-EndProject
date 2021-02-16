package functions;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import utilities.Utility;

public class ViewFiles extends Utility {
	
	public void showFiles() {
		File directory = new File(DIRECTORY);
		List<String> list = Arrays.asList(directory.list());
		System.out.println("List of All Files: ");
		
		//check if stream is empty and print accordingly
		if(list.stream().findAny().isPresent()) list.stream().forEach(n -> System.out.println(n));
		else System.out.println("Empty Directory");
	}
	
	private void sortFiles() {
		//TODO: implement sorting algorithm here
	}

}
