package other_codes;

import java.util.*;

public class Find_areaofrectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int length , width , area ;
			
		System.out.print("Enter value of length : ");
		length = input.nextInt();

		System.out.print("Enter value of width : ");
		width = input.nextInt();
		
		area = length * width ;
		System.out.print("Area Of Rectangle is : " + area);

	}

}
