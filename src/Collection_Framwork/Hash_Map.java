package Collection_Framwork;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
//		HashMap<Integer , String> index_name = new HashMap<Integer,String>();
		HashMap<String , String> index_name = new HashMap<String,String>();
		
		index_name.put("1", "Suresh");
		index_name.put("2", "Ramesh");
		index_name.put("3", "Hitesh");
		index_name.put("4", "Jinesh");
		index_name.put("5", "Dinesh");
		
		System.out.println(index_name);
		System.out.println(index_name.get("2"));
		index_name.remove("2");
		System.out.println(index_name);
		System.out.println("Size of HashMap : " + index_name.size());
		
//		for (Entry<Integer, String> entry : index_name.entrySet()) {
//		    Integer key = entry.getKey();
//		    Object value = entry.getValue();
//		System.out.println("Value of "+key+" is: "+value);
//		}
		
		for (String i : index_name.keySet()) {
		      System.out.println("key: " + i + " value: " + index_name.get(i));
		    }
		
		index_name.clear();
		System.out.println(index_name);
	}

}
