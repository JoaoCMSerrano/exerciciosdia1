package pt.com.everis.academia.java;

public class Conversao {

	public static void main(String[] args) {

		/* Exemplo não possivel de conversão directa
		 * 
		 * double d = 3.1415;
		 * int i = d;
		 */
		
		/*
		int i2 = 5;
		
		double d2 = i;
		
		System.out.println(d2);
		*/
		
		// Exemplo de conversão que não é errada 
		long l3 = 12345678901l;
		int i3 = (int) l3;
		System.out.println(i3);
		
	}

}
