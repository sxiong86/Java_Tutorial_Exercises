import java.util.Scanner;

public class Tutorial08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//Without Do While Loop
		System.out.println("Guess the correct number between 0 - 4 to end the loop:");
		int value1 = scanner.nextInt();
		
		while(value1 != 4) {
			System.out.println("That is the wrong number. Please try again:");
			value1 = scanner.nextInt();
		}
		
		//With Do While Loop
		int value2 = 0; //Remember that your variable must be declared outside of the Do While Loop
		
		do {
			System.out.println("Guess the correct number between 5 - 9 to end the loop:");
			value2 = scanner.nextInt();
		}
		while(value2 != 8);
		
		System.out.println(value2 + " is the correct number! Loop terminated.");
	}
}
