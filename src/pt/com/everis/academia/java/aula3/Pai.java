package pt.com.everis.academia.java.aula3;

import java.util.Arrays;

public class Pai implements Comparable<Pai>{
	
	private Integer id;
	
	public Pai(Integer id) {
		super();
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int compareTo(Pai otherPai) {
		return id.compareTo(otherPai.getId());
	}

	@Override
	public String toString() {
		return "Pai(" + id + ")";
	}

	public static void main(String[] args) {
		
		Pai[] array = new Pai[5];
		array[0] = new Pai(1);
		array[1] = new Pai(3);
		array[2] = new Pai(5);
		array[3] = new Pai(2);
		array[4] = new Pai(4);
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		//Este caso é melhor no caso de ordenarmos sempre pelo mesmo critério
	}

}
