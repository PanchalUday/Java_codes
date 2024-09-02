package Exceptions;

public class Ex2 {
	
	public static void main(String[] args) {
		
	    try {
	      int[] myNumbers = {0,1,2,3,4,5,6,7,8,9};
	      System.out.println(myNumbers[9]);
	    }
	    catch (Exception e) {
	      System.out.println("Something went wrong.");
	    } 
	    finally {
	      System.out.println("The 'try catch' is finished.");
	    }
	    
	  }
}
