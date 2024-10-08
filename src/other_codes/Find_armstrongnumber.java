package other_codes;

import java.util.Scanner;

public class Find_armstrongnumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float number, originalNumber, remainder;
		double result = 0;

		System.out.print("Input number : ");
		number = input.nextFloat();
			
	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result = result + (remainder*remainder*remainder);
	            originalNumber = originalNumber / 10;
	        }

	        if(result == number){
	            System.out.println(number + " is an Armstrong number.");}
	        else {
	            System.out.println(number + " is not an Armstrong number.");
		 }

	}

}
