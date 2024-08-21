package other_codes;

import java.util.Scanner;

public class Find_areaofsquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float area , length;
	
		System.out.print("Input Length Of Side : ");
		length = input.nextFloat();
		
		area = length*length ;

		System.out.println("Area of square is : " + area);

	}

}
