package pt.com.everis.academia.java;

import java.util.ArrayList;
import java.util.List;

public class TesteBook {

	public static void main(String[] args) {

		Book book1 = new Book("465454");
		Book book2 = new Book("465454");

		System.out.println(book1.equals(book2));

		List<Book> books = new ArrayList<>();

		books.add(new Book("a"));
		books.add(new Book("b"));
		books.add(new Book("c"));

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			System.out.println(book.getIsbn());
		}

		for (Book book : books) {
			System.out.println(book.getIsbn());
		}
	}

}
