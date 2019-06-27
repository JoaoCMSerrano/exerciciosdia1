package pt.com.everis.academia.java.aula4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimulaFileNotFoundException {

	public static void main(String[] args) {

		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("/tmp/arq.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
