package Collection_Framwork;
import java.util.*;

public class Itrator_3 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    
	    System.out.println(numbers);

	    
	    Iterator<Integer> it = numbers.iterator();
	    while(it.hasNext()) {
	      Integer i = it.next();
	      if(i < 10) {
	        it.remove();
	      }
	    }
	    
	    System.out.println("After remove num < 10 : " + numbers);

	}

}
