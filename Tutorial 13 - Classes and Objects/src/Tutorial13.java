/*
 * This is our main method (identifiable by the 'public static void main(String[] args)' line. This is where your program will run from
 */
public class Tutorial13 {

	public static void main(String[] args) {
		
		//We are accessing the variables from our MyPersonClass class to create two person in our main method.
		MyPersonClass person1 = new MyPersonClass();
		person1.name = "Sean Xiong";
		person1.age = 20;
		
		MyPersonClass person2 = new MyPersonClass();
		person2.name = "Linda Nguyen";
		person2.age = 19;
		
		System.out.println(person1.name + " " + person1.age);
		System.out.println(person2.name + " " + person2.age);
	}
}
