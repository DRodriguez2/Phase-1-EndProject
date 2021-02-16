package utilities;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utility {
	public final static Logger Logger = LogManager.getLogger(Utility.class);
	public final static Scanner sc = new Scanner(System.in);
	
	//This is the directory path to the folder where all the files should be located. 
	//Change if needed.
	public final String DIRECTORY = System.getProperty("user.dir") + "\\FILESAREHERE";
	
	
	public static String handleUserInput() {
		String input = sc.next();
		return input;
	}
	
}
