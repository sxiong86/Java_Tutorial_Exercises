
public class Tutorial05 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
		/*
		* 'int i = 0' means our initial value of i is 0; 'i < 5' means execute For Loop as long as i is less than 5;
		* 'i++' means increment i by 1 after each executed For Loop.
		*/
			
			System.out.println("The value of i is " + i);
			
			System.out.printf("The value of i is %d\n", i);
			/*
			 * Similar as above but 'printf' will continue to print on the same line unless specified by '\n' which means
			 * next line. %d is a special character notifying the program to replace it with a designated variable that's
			 * after the comma which in our case is i.
			 */
		}
	}
}
