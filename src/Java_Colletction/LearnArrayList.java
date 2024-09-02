package Java_Colletction;
import java.util.*;

public class LearnArrayList {

	public static void main(String[] args) {
		
		
		List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(list);

        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);

        System.out.println(list.get(1));

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("the element is " + list1.get(i));
        }

        for (Integer element: list1) {
            System.out.println("foreach element is " + element);
        }

        Iterator<Integer> it = list1.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
        list1.set(2, 1000);

        System.out.println(list1);

        System.out.println(list1.contains(500));
        list1.remove(1);  // This will remove the element at index 1 i.e 20.
        System.out.println(list1);

        list1.remove(Integer.valueOf(30)); // This will remove 30 from the list
        System.out.println(list1);

        list1.clear(); //This will remove all the elements from the list.
        System.out.println(list1);
		
		

	}

}
