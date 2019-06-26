package pt.com.everis.academia.java.aula3;

import java.util.Arrays;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<String, Object> map = new Hashtable<>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1","2"));
		
		//contains
		System.out.println(map.contains("1"));
		
		//containsKey
		System.out.println(map.containsKey("A"));
		
		//remove
		map.remove("A");
		System.out.println(map);
	}

}
