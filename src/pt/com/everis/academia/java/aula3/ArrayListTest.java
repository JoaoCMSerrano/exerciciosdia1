package pt.com.everis.academia.java.aula3;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(2);

		System.out.println(list);

		//ForEach
		List<Object> listb = new ArrayList<>();
		listb.add(1);
		listb.add("A");
		listb.add("B");

		//Antes Java 8
		listb.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object n) {
				System.out.println(n);
			}
		});

		//Depois Java 8
		listb.forEach((n) -> System.out.println(n));


		//removeIf
		List<Object> listc = new ArrayList<>();
		listc.add(1);
		listc.add("A");
		listc.add("B");
		listc.add("C");
		listc.add(2);


		//Antes Java 8
		listc.removeIf(new Predicate<Object>() {

			@Override
			public boolean test(Object n) {
				return n instanceof Integer;
			}
		});
		System.out.println(list);
		
		//Depois Java 8
		listb.removeIf(n -> n instanceof String);
		System.out.println(list);
	}


}
