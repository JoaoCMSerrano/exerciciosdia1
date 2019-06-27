package pt.com.everis.academia.java.aula4;

public class SimulaArithmeticException {

	public static void main(String[] args) {

		int valor1 = 10;
		int valor2 = 0;
		
		try {
			System.out.println(valor1 / valor2);
			
		} catch (ArithmeticException e) {
			throw e;
		}
	}

}
