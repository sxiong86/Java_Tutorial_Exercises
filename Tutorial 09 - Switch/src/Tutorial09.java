import java.util.Scanner;

public class Tutorial09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the command start or stop:");
		String cmd = scanner.nextLine();
		
		//Switch will only work with 'String' or 'int' data types
		switch(cmd) {
		case "start": //This case will only execute if user correctly inputs "start"
			System.out.println("Program started!");
			break;
			
		case "stop": //This case will only execute if user correctly inputs "stop"
			System.out.println("Program stopped!");
			break;
			
		default: //Any other user input defaults to this execution
			System.out.println("Command not recognized!");
			break;
		}
	}
}
