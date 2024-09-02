package Exceptions;

public class Ex3 {
	
	static void checkAge(int age) { 
	    if (age < 18) {
	      throw new ArithmeticException("You are under 18"); 
	    } 
	    else {
	      System.out.println("You are old enough!"); 
	    }
	 } 

	public static void main(String[] args) {
		
		checkAge(19);
		
	}

}
