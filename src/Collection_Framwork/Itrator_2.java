package Collection_Framwork;
import java.util.*;

public class Itrator_2 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	  
	    // Get the iterator
	    Iterator<String> it = cars.iterator();
	    
	    // Loop through a collection
	    while(it.hasNext()) {
	      System.out.println(it.next());
	    }

	}

}
