
public class Tutorial03 {

	public static void main(String[] args) {
		//String is a non-primitive data type (like Array)
		String greeting = "Greetings";
		String space = " ";
		String name = "Sean";
		String sentence = greeting + space + name + "!";
		
		int number = 4;
		
		//Similar
		System.out.println(sentence);
		System.out.println("Greetings" + " " + "Sean" + "!"); //Concatenation of strings
		
		System.out.println("My favorite number is " + number); //String and variable
	}
}
