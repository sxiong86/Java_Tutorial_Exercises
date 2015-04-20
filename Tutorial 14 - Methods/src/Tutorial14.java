//You can create a class within the same 'Main Method' file; When you do, create it above the entire main method.
class Person {
	
	String name;
	int age;
	
	//Sub-routines (Methods) within our class for use in our 'Main Method'
	void speak() {
		System.out.println("Hello. My name is " + name + " and I am " + age + " years old.");
	}
	
	void boy() {
		System.out.println("I am a boy!");
	}
	
	void girl() {
		System.out.println("I am a girl!");
	}
	
}

public class Tutorial14 {

	public static void main(String[] args) {
		
		//Person 1
		Person person1 = new Person();
		person1.name = "Sean Xiong";
		person1.age = 20;
		person1.speak(); //Invoking the 'speak()' method from our 'Person' class with data filled appropriately for Person 1
		person1.boy();   //Invoking the 'boy()' method from our 'Person' class with data filled appropriately for Person 2
		
		//Next line
		System.out.println();
		
		//Person 2
		Person person2 = new Person();
		person2.name = "Linda Nguyen";
		person2.age = 19;
		person2.speak();
		person2.girl();
		
		
	}

}
