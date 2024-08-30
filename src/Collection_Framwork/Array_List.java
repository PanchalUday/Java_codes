package Collection_Framwork;

import java.util.ArrayList;
import java.util.Collection;

public class Array_List {

	public static void main(String[] args) {
		
	    ArrayList<String> cars = new ArrayList<String>();
		
	    
	    // Insert elements to at starting (0)
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Toyota");
	    cars.add("Honda");
	    cars.add("Porsche");
	    
	    System.out.println(cars);
	    
	    //Access a car using index
	    System.out.println(cars.get(2));
	    
	    //modify a car
	    System.out.println(cars.set(3,"Hundai"));
	    
	    //Remove a car
	    System.out.println(cars.remove(3));
	    System.out.println(cars);
	    
	    //List Size
	    System.out.println(cars.size());
	    
//	    //clear(data) List
//	    cars.clear();
//	    System.out.println(cars);
	    
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	    }
	    

	}

}
