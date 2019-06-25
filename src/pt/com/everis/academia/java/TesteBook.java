package pt.com.everis.academia.java;

public class TesteBook {

	public static void main(String[] args) {
		
		Book book1 = new Book("465454");
		Book book2 = new Book("781322");
		
		System.out.println(book1.equals(book2));

	}

}
