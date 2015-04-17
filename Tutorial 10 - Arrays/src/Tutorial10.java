
public class Tutorial10 {

	public static void main(String[] args) {
		
		int[] array1; //Non-primitive data type; the [] means Array
		array1 = new int[4]; //Our array has 4 elements (ALWAYS BEGINS WITH 0 SLOT)
		
		System.out.println(array1[1]); //Prints value in array slot 1 (Will output 0 as Slot 1 currently has no value)
		
		//Now we fill the array with values for each slot
		array1[0] = 30; //Array slot 0 is equivalent to 1st Array...
		array1[1] = 60; //... And so on.
		array1[2] = 90;
		array1[3] = 120;
		
		//We can check the array by output
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		
		//We can also check our array by iteration
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		//Initializing and declaring an array at once
		int[] array2 = {20, 40, 60, 80};
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
