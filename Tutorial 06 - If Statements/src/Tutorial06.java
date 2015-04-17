
public class Tutorial06 {

	public static void main(String[] args) {
		boolean condition1 = 4 == 5; //'==' means to check if equals
		boolean condition2 = 4 != 5; //'!=" means to check if not equals
		
		System.out.println(condition1);
		System.out.println(condition2);
		
		//Now onto If Statements...
		int value = 4; //Our value is 4
		
		if(value > 4) { //If our value is greater than 4 then print this (which is not)
			System.out.println("Yes! " + value + " is greater than 4!!!");
		}
		else if(value < 4) { //Else if our value is less than 4 then print this (which is not)
			System.out.println("Yes! " + value + " is less than 4!!!");
		}
		else { //Else our value is equal to 4 so print this (which is)
			System.out.println("Yes! " + value + " is equal to 4!!!");
		}
		
		//While Loop and If Statement combination
		int loop = 1; //Our loop is 1
		
		while(loop < 4) { //While our loop is less than 4, we continue to execute...
			System.out.println("Looping: " + loop);
			
			if(loop == 3) { //However, if our loop is equals to 3, we stop!
				System.out.println("Stop!");
				break; //'break;' stops the loop
			}
			//Continue executing these as the If Statement condition has not been met and then repeat While Loop again
			loop++; //Increment our loop by 1
			System.out.println("Running...");
		} //... While Loop will eventually stop when loop incrementing reaches 3
	}
}
