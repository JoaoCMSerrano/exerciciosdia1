package pt.com.everis.academia.java;

public class Wrappers3 {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf("1101011", 2); //Cria um Integer a partir do binário
		System.out.println(i);
		Short s = Short.valueOf("1FF", 16); //Cria um short a partir do hexadecimal
		System.out.println(s);
		Float f = Float.valueOf(5.25f);
		System.out.println(f);
		Double d = Double.valueOf("4.3");
		System.out.println(d);
		
	}

}
