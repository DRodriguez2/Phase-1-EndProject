package functions;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class SearchFile {

	public void search(String _fileName, String _directory) {
		File directory = new File(_directory);
		List<String> list = Arrays.asList(directory.list());
		
		if(list.stream().anyMatch(n -> n.equals(_fileName))) {
			System.out.println("File found");
		}
		else System.out.println("File not found");
	}
}
