package Java_Colletction;
import java.util.*;

public class LearnArrayClass {

	public static void main(String[] args) {
		
		 int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
       int index = Arrays.binarySearch(numbers, 4);

       System.out.println("The index of element 4 in the array is " + index);

       Integer[] numbers1 = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
       Arrays.sort(numbers1);

       Arrays.parallelSort(numbers1);
       // 8192

       Arrays.fill(numbers1, 12);

       for (int i : numbers1) {
           System.out.print(i + " ");
       }
		
	}

}
