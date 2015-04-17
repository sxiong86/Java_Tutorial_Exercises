
public class Tutorial12 {

	public static void main(String[] args) {
		
		int[] array = {1, 1, 1000}; //One-Dimensional Array
		
		//1st example in integers
		int[][] grid = { //Multi-Dimensional array requires two []; this one will be a 3x3 Array
			{3, 6, 2000},
			{4, 7, 3000},
			{5, 8, 4000},
		};
		
		System.out.println(grid[0][0]); //1st array element is the row, 2nd array element is the column; element at Row 0, Column 0
		System.out.println(grid[2][2]); //Element at Row 2, Column 2
		System.out.println(); //Empty line just for spacing purposes on console
		
		//Will output our entire grid exactly as how we created it
		for(int i = 0; i < grid.length; i++) { //For each row...
			for(int j = 0; j < grid[i].length; j++) { //For each column...
				System.out.print(grid[i][j] + "\t"); //... Output every element in each row on the same line; Notice 'print' NOT 'println'
			}
			System.out.println(); //Notice this is outside the inner For Loop; used as next line
		}
		System.out.println();
		
		//2nd example in Strings
		String[][] words = new String[2][]; //You can leave the column empty for Strings; will be 'null'
		
		System.out.println(words[0]); //We have 2 rows in our array but no defined column; outputs 'null'
		System.out.println();
		
		//Giving each row two columns
		words[0] = new String[2]; //Keep in mind when inputting row position it is always # of elements - 1
		words[1] = new String[2];
		
		//Allocating a String in each element of our Multi-Dimensional Array
		words[0][0] = "A"; //Keep in mind when inputting column position it is always # of elements - 1
		words[0][1] = "B";
		words[1][0] = "C";
		words[1][1] = "D";
		//How it will look like...
		//        A B
		//        C D
		
		System.out.println(words[0][0]); //Outputs A
		System.out.println(words[1][1]); //Outputs D
		System.out.println();
		
		//Prints our 2x2 Multi-Dimensional String Array
		for(int m = 0; m < words.length; m++) {
			for(int n = 0; n < words[m].length; n++) {
				System.out.print(words[m][n] + "\t");
			}
			System.out.println();
		}
	}
}
