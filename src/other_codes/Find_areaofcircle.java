package other_codes;

import java.util.*;

public class Find_areaofcircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float PI = 3.141f , radius , area ;
			
			
		System.out.print("Enter Radius of circle : ");
		radius = input.nextFloat();
		
		area = PI*radius*radius;
		System.out.println("Area of circle is : " + area);

	}

}
