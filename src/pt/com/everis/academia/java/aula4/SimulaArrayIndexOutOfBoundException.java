package pt.com.everis.academia.java.aula4;

import java.util.ArrayList;
import java.util.List;

public class SimulaArrayIndexOutOfBoundException {

	public static void main(String[] args) {

		List<String> meuArray = new ArrayList<String>();
		meuArray.add("Valor 001");
		meuArray.add("Valor 002");
		meuArray.add("Valor 003");
		meuArray.add("Valor 004");
		meuArray.add("Valor 005");

		meuArray.get(-1);

	}

}
