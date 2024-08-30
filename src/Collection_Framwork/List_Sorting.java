package Collection_Framwork;

import java.util.ArrayList;
import java.util.Collections;

public class List_Sorting {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
	    
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Toyota");
	    cars.add("Honda");
	    cars.add("Porsche");
	    System.out.println(cars);
	    
	    Collections.sort(cars);
	    System.out.println(cars);
	    
	    Collections.sort(cars, Collections.reverseOrder()); 
	    System.out.println(cars);

	}

}
