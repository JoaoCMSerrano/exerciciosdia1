package pt.com.everis.academia.java.aula3;

import java.util.Stack;

public class StackTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Stack list = new Stack<>();

		// Testando o Push
		list.push(1);
		list.push("A");
		list.push("B");

		System.out.println(list);

		// Testando o Peek
		System.out.println(list.peek());

		// Testando o Pop
		System.out.println(list.pop());

		System.out.println(list);
	}

}
