package pt.com.everis.academia.java;

public class Exercicio2 {

	public static void main(String[] args) {
		final int NUM = 6;
		for(int i = 0; i<NUM;i++) {
			System.out.println(X(i));
		}

	}

	public static int X(int n) {
		int result = 1;
		for(int i=2; i<=n; i++) {
			result *=i;
		}
		return result;
	}

}
