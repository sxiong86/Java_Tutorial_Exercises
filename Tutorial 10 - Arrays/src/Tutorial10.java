
public class Tutorial10 {

	public static void main(String[] args) {
		
		int[] array1; //Non-primitive data type
		array1 = new int[4]; //Our array has a size of 4 (ALWAYS BEGINS WITH 0 SLOT)
		
		System.out.println(array1[1]); //Prints value in array slot 1 (Will output 0 as Slot 1 currently has no value)
		
		//Now we fill the array with values for each slot
		array1[0] = 30;
		array1[1] = 60;
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
