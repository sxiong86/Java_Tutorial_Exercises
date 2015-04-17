import java.util.Scanner;


public class Tutorial07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //Scanner object for user input
		
		System.out.println("Hello. What is your name?"); //Prompt for user
		
		String answer = input.nextLine(); //Awaits user string response and saves that into 'answer'
		
		System.out.println("Nice to meet you " + answer + "! How old are you if I may ask?"); //Greets user
		
		int age = input.nextInt(); //Awaits user integer response and saves that into 'age'
		
		System.out.println("You are " + age + " years old... Getting younger by the day!"); //Response to user
	}
}
