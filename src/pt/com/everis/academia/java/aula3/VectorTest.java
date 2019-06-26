package pt.com.everis.academia.java.aula3;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new Vector<>();
		list.add(1);
		list.add("A");
		list.add("B");

		//Testando o toArray
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));

		//Testando o Clear
		list.clear();
		System.out.println(list);

		//Testando o isEmpty
		System.out.println(list.isEmpty());

	}

}
