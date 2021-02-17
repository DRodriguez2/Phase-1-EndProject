package functions;

import utilities.Utility;

public class Menu extends Utility {

	private static AddFile addFile = new AddFile();
	private static DeleteFile deleteFile = new DeleteFile();
	private static ViewFiles viewFiles = new ViewFiles();
	private static SearchFile searchFile = new SearchFile();
	
	public static void showMainMenu() {
		System.out.println("\t\t------------------------------------------------");
		System.out.println(String.format("\t\t|%s|", "Company Lockers Pvt. Ltd Prototype Application"));
		System.out.println(String.format("\t\t|%s|", "       Developer: Diego Rodriguez (HCL)       "));
		System.out.println("\t\t------------------------------------------------\n");
		
		
		System.out.println(String.format("\t\t\t   ------ %s ------\n", "Main Menu"));
		System.out.println(String.format("********** %s **********", "Enter the number of one of the following menu functions"));
		System.out.println("\n1) View all file names \n");
		System.out.println("2) Add a file \n");
		System.out.println("3) Delete a file \n");
		System.out.println("4) Search for a file \n");
		System.out.println("5) Exit \n");
		
		handleOption(handleUserInput());
	}
	
	public static void showSubMenu() {
		System.out.println(String.format("\t   ------ %s ------\n", "Sub Menu"));
		System.out.println(String.format("********** %s **********", "Would you like to go again?"));
		System.out.println("\n6) Return to main menu \n");
		System.out.println("7) Exit \n");
		
		handleOption(handleUserInput());
	}
	
	protected static void handleOption(String _option) {
		switch(_option) {
		
		case "1": 
			viewFiles.showFiles(DIRECTORY);
			showSubMenu();
			break;
		case "2": 
			System.out.println("Enter the name of the file to create: \n");
			addFile.add(handleUserInput(), DIRECTORY);
			showSubMenu();
			break;
		case "3": 
			System.out.println("Enter the name of the file to delete: \n");
			deleteFile.delete(handleUserInput(), DIRECTORY);
			showSubMenu();
			break;
		case "4": 
			System.out.println("Enter the name of the file to search for: \n");
			searchFile.search(handleUserInput(), DIRECTORY);
			showSubMenu();
			break;
		case "5": 
		case "7":
			System.out.println("Good Bye");
			System.exit(0);
			break;
		case "6":
			showMainMenu();
			break;
		default: 
			System.out.println("Invalid option");
			showMainMenu();
			
		}
	}
}
