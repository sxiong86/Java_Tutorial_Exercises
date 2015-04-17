
public class Tutorial11 {

	public static void main(String[] args) {
		String[] words = new String[3]; //Remember the variable 'words' is just a reference to our 3 element array
		
		//1st example of Array of Strings
		words[0] = "How ";
		words[1] = "are ";
		words[2] = "you?";
		
		System.out.println(words[0] + words[1] + words[2]); //Concatenation of our 3 element array
		
		//2nd example of Array of Strings
		String[] fruits = {"Apple", "Banana", "Peach"};
		
		for(String fruit: fruits) { //Iterates through each element of fruits array into the variable fruit
			System.out.println(fruit);
		}
		
		int value = 0; //Default for primitive is 0
		
		String text = null; //Default for non-primitive is 'null' (Non-Primitive always start with a capital letter)
		
		//3rd example of Array of Strings
		String[] texts = new String[3];
		
		System.out.println(texts[2]); //Will output 'null' as we have not allocated any memory to text[2] yet
		
		texts[2] = "Filled"; //Now we fill text[2] with enough allocated memory for the String "Filled"
		
		System.out.println(texts[2]); //Will now output "Filled"
	}
}
