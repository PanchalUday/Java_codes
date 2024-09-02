package Collection_Framwork;

import java.util.HashSet;

public class Hash_Set1 {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<Integer>();

	    numbers.add(9);
	    numbers.add(4);
	    numbers.add(3);

	    for(int i = 1; i <= 10; i++) {
	      if(numbers.contains(i)) {
	        System.out.println(i + " was found in the set.");
	      } else {
	        System.out.println(i + " was not found in the set.");
	      }
	    }

	}

}
