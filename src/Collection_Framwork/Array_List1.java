package Collection_Framwork;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List1 {

	public static void main(String[] args) {

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);
	    
	    System.out.println(myNumbers);
	    
	    //Access a car using index
	    System.out.println(myNumbers.get(2));
	    
	    //modify a car
	    System.out.println(myNumbers.set(3,66));
	    
	    //Remove a car
	    System.out.println(myNumbers.remove(3));
	    System.out.println(myNumbers);
	    
	    //List Size
	    System.out.println(myNumbers.size());
	    System.out.println();

	    Collections.sort(myNumbers);

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }

	}

}
