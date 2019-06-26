package pt.com.everis.academia.java.aula3;

import java.util.ArrayDeque;

public class ArrayDequeTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayDeque queue = new ArrayDeque<>();
		queue.addFirst(new Pessoa("Antonio",32));
		queue.addFirst(new Pessoa("Fabio",25));
		queue.addFirst(new Pessoa("João",16));
		queue.addFirst(new Pessoa("José",32));
		queue.addFirst(new Pessoa("Maria",10));

		//PEEK
		System.out.println(queue.peek());
		
		//GETLAST
		System.out.println(queue.getLast());
		
		ArrayDeque queue2 = new ArrayDeque<>();
		queue2.addFirst(new Pessoa("Antonio",32));
		queue2.addFirst(new Pessoa("Fabio",25));
		queue2.addFirst(new Pessoa("João",16));
		queue2.addFirst(new Pessoa("José",32));
		queue2.addLast(new Pessoa("Maria",10));
		
		//GETFIRST
		System.out.println(queue2.getFirst());

	}

}
