// Assignment #: 2
//		   Name: Alan Griffieth
// 	  StudentID: 1212575453
// 		ClassID: 70641
//	Description: 


package cse360assign2;

/**
 * This class is used to create an Adding Machine
 * 
 * @author Alan Griffieth
 */

public class AddingMachine {
	
	private int total;
	
	/**
	 * This constructs an Adding Machine and initializes the total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method returns the total calculated by the Adding Machine
	 * 
	 * @return total The total calculated by the adding machine
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method uses the Adding Machine to add to the total
	 * 
	 * @param value The value to be added
	 */
	public void add (int value) {
		
	}
	
	/**
	 * This method uses the Adding Machine to subtract from the total
	 * 
	 * @param value The value to be subtracted
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * This method returns a history of the transactions for the Adding Machine 
	 * in string format
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * This method resets the Adding Machine by clearing the transactions and
	 * setting the total to 0
	 */
	public void clear() {
		total = 0;
	}
	

}
