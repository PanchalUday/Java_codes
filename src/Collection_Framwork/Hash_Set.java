package Collection_Framwork;

import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.contains("Mazda"));
	    System.out.println(cars.remove("Mazda"));
	    System.out.println(cars);
	    System.out.println("size of array : " + cars.size());
	    
	    System.out.println();
	    for (String i : cars) {
	    	  System.out.println(i);
	    	}
	    System.out.println();
	    
	    System.out.println(cars.remove("Mazda"));
	    cars.clear();
	    System.out.println(cars);

	}

}
