package Java_Generics;


// Learn from : https://docs.oracle.com/javase/tutorial/java/generics/types.html


import java.util.ArrayList;

public class g1 {

	public static void main(String[] args) {
		
//      Without Java Generics :

//		ArrayList myArrayList = new ArrayList();
//		myArrayList.add(10);  //Integer value
//		myArrayList.add("Harry Bhai!"); //String value
//		myArrayList.add(20.4); //Double value
//		System.out.println(myArrayList);
      
      
      
    	ArrayList<Integer> myArrayList = new ArrayList();
    	
//   	 With Java Generics : (this commented code gives error)
    	
//    	myArrayList.add(10);  //Integer value
//    	myArrayList.add("Asus ROG!"); //String value
//    	myArrayList.add(20.4); //Double value
//    	System.out.println(myArrayList);

		
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);

        System.out.println(myArrayList);
        
        int x = myArrayList.get(2);
        System.out.println("getting index value of 2 is : "+x);
		
	}

}
