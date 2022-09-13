/*
Part 1:
- Write a main that creates an array of whole numbers randomly containing 1 to 10 elements

Part 2:
- Populate the array with random elements in the range -50 to 50
- Print the array

Part 3:
- Print how long the program took to run
*/

public class actMain {
	
	public static void main(String args[]) {
	
// Part 1
	int mySize = (int)(Math.random() * 10 + 1); // This creates the whole numbers from 1 - 10

	int ary[]; // creating the array
	
	ary = new int[mySize]; // initializing the array with whole numbers from 1 - 10
	
// Part 2
	int i;
	for (i = 0; i < ary.length; i++) { // A for loop that will run depending on the amount of elements in the array
		
		int j = (int)(Math.random() * 101 - 50); // Initializing j to populate a random whole number from -50 - 50
		
		ary[i] = j; // Setting j to the i index in the array
		
		int num = i + 1; // Used to make the location 1 - 10 instead of 0 - 9 when printing
		
		System.out.println(num + ": " + ary[i]); // Prints out the value at the i index
		
	}
// Part 3
	long duration = System.nanoTime()/1000000000; // Converts nanoseconds to seconds
	
	System.out.println("The program took " + duration + " secs to run."); // Prints how long in seconds
	}
}