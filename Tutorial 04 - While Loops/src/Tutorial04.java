
public class Tutorial04 {

	public static void main(String[] args) {
		int numb1 = 1;
		int numb2 = 10;
		boolean solve1 = numb1 < numb2;
		
		boolean solve2 = 4 > 5;
		
		System.out.println(solve1); //Prints "true" as 1 is lesser than 10
		System.out.println(solve2); //Prints "false" as 4 is not greater than 5
		
		//Now onto While Loops...
		int value = 1;
		
		//While the value is less than 4, continue to print out until value is greater than 4
		while(value < 4) { //Whatever inside the parenthesis is called "Condition"
			System.out.println(value); //Prints the current value
			value = value + 1; //Increment current value each time the loop executes
		}
	}

}
