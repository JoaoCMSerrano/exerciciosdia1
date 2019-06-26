package pt.com.everis.academia.java.aula3;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;

		//TOSTRING
		System.out.println(Arrays.toString(array));

		//BINARYSEARCH
		System.out.println(Arrays.binarySearch(array, 3));

		//EQUALS
		int[] array2 = new int[2];
		array2[0] = 1;
		array2[1] = 2;
		int[] array3 = new int[2];
		array3[0] = 1;
		array3[1] = 2;
		System.out.println(Arrays.equals(array2, array3));

		//FILL
		Arrays.fill(array, 0);
		System.out.println(Arrays.toString(array));

		//SORT
		array[0] = 3;
		array[1] = 4;
		array[2] = 1;
		array[3] = 5;
		array[4] = 2;
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		//COPYOFRANGE
		int[] newArray = Arrays.copyOfRange(array, 1, 3);
		System.out.println(Arrays.toString(newArray));
	}

}
