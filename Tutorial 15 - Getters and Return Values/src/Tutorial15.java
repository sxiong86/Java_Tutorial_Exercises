
class Friend {
	
	String names;
	int ages;
	
	//The following are 'Getters' methods...
	
	//This 'Getter' method will just return the stored names (AKA gets the names)
	String getName() {
		return names;
	}
	
	//This 'Getter' method will just return the stored ages (AKA gets the ages)
	int getAge() {
		return ages;
	}
	
	//The following are 'Return' methods...
	
	//This method will return no values to our 'Main Method' call because of the keyword 'void'
	void speak() {
		System.out.println("My friend's name is " + names + ".");
	}
	
	///This method will return an int value to our 'Main Method' call because of the keyword 'int'
	int calculateAge () {
		int yearsUntil = 100 - ages;
		return yearsUntil;
	}
	
}

public class Tutorial15 {

	public static void main(String[] args) {

		//Our friend's information being stored into appropriate variables
		Friend friend = new Friend();
		friend.names = "Joe";
		friend.ages = 20;
		
		//Calling the 'Getters' methods to return our friend Joe's name and age values
		String name = friend.getName();
		System.out.println(name);
		int age = friend.getAge();
		System.out.println(age);
		
		//Calling the 'Return' method 'speak()'
		System.out.println();
		friend.speak();
		
		//Sets variable 'years' equal to the return value of our 'Return Method' 'calculateAge()' and then prints
		int years = friend.calculateAge();
		System.out.println("His has " + years + " years left until reaching 100!");
		
	}

}
