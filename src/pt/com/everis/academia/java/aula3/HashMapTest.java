package pt.com.everis.academia.java.aula3;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		//Put(key, value)
		HashMap<String, Object> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1","2"));

		//Clear
		System.out.println(map);
		map.clear();
		System.out.println(map);

		//Get(key)
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("A", "1");
		map2.put("B", Arrays.asList("1","2"));
		System.out.println("A -> " + map2.get("A"));
		System.out.println("B -> " + map2.get("B"));


	}

}
