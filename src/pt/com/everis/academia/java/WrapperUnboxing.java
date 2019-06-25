package pt.com.everis.academia.java;

public class WrapperUnboxing {

	public static void main(String[] args) {
		Integer i = new Integer(125);
		Integer j = i;
		System.out.println(i==j); // (true) referem-se a um mesmo objecto
		i++;
		j++;
		System.out.println("i = " + i);
		System.out.println(i == j); // (false) referem-se a objectos diferentes

	}

}
