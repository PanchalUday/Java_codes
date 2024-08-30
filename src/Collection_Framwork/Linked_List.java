package Collection_Framwork;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
	    // Use addFirst() to add the item to the beginning
	    cars.addFirst("skoda");
	    System.out.println(cars);
	    
	    // Use addFirst() to add the item to the beginning
	    cars.addLast("Toyota");
	    System.out.println(cars);
	    
	    System.out.println(cars.get(2));
	    
	    System.out.println(cars.removeFirst());
	    System.out.println(cars);
	    System.out.println(cars.removeLast());
	    System.out.println(cars);
	    System.out.println(cars.remove(1));
	    System.out.println(cars);
	    System.out.println(cars.getFirst());
	    System.out.println(cars.getLast());
	    
	    

	}

}
