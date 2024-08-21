package other_codes;
import java.util.*;

public class Find_factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int factorial = 1;
		
		System.out.println("Enter the number to find Factorial : ");
		
		int number = input.nextInt();
		
		for(int i = 1 ; i<=number ; i++) {
			factorial = factorial*i;
		}
		System.out.println("The Factorial of "+number+" is "+ factorial);
		
	}

}
