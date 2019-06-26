package pt.com.everis.academia.java.aula3;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List list = new LinkedList<>();
		list.add(1);
		list.add("A");
		list.add("B");

		//Testando o contains
		System.out.println(list.contains("A"));

		//Testando o remove
		list.remove("A");
		System.out.println(list);

		//Testando o size
		System.out.println(list.size());
	}

}
