package other_codes;

import java.util.Scanner;

public class Find_areaoftriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float base , height , area ;
		
		System.out.println("Enter Base of Triangle : ");
		base = input.nextFloat();
		
		System.out.println("Enter Height of Triangle : ");
		height = input.nextFloat();
		
		area = (base*height)/2;
		System.out.println("Area Of Triangle is : "+ area);
	}
}