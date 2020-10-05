/**  
* AddingMachine.java - Second version
* @author Wen Fang
* @data 10/05/2020
* @version 2.0
* @github https://github.com/wen7752/cse360assignment02
*/ 
package cse360assignment02;

public class AddingMachine {

	//initialize the variables 
	private int total;
	private String result = "0";
		
	  	  public AddingMachine () {
			 total = 0;
			 result = "0";
		  }
		  
	  	  //return the total 
		  public int getTotal () {
		    return total;
		  }
		  
		/**
		 * adding the value to total and store the value
		 * into the result string.
		 */
		  public void add (int value) {
			  
			  total = total + value; //add to the result
			  result = result + " + " + value; //add to the string
		  }
		  /**
		   * subtracting the value to total and store the value
		   * into the result string.
		   */
		  public void subtract (int value) {
			  
			  total = total - value;
			  result = result + " - " + value;
		  }
		  
		  
		  /**
		   * return the stored string
		   */
		  public String toString () {
		    return result.toString();
		  }
		  
		  /**
		   *Clear the memory 
		   */
		  public void clear() {
			  
			  total = 0;
			  result = "0";
		  }
	  
  
  
  public static void main(String[] args) {
		
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		//Print out the toString method 
		System.out.println(myCalculator.toString());
		//System.out.println(myCalculator.getTotal());
		
		
	}
}