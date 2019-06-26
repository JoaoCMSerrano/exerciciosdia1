package pt.com.everis.academia.java.aula3;

import java.util.Arrays;
import java.util.Comparator;

public class Pai2 {

	private Integer id;
	private Integer idade;

	public Pai2(Integer id, Integer idade) {
		super();
		this.id = id;
		this.idade = idade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pai(id:" + id + ",idade:" + idade + ")";
	}

	public static void main(String[] args) {

		Pai2[] array = new Pai2[5];
		array[0] = new Pai2(1,32);
		array[1] = new Pai2(3,65);
		array[2] = new Pai2(5,43);
		array[3] = new Pai2(2,62);
		array[4] = new Pai2(4,23);

		Arrays.sort(array, new Comparator<Pai2>() {

			@Override
			public int compare(Pai2 o1, Pai2 o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});

		System.out.println(Arrays.toString(array));


		Arrays.sort(array, new Comparator<Pai2>() {

			@Override
			public int compare(Pai2 o1, Pai2 o2) {
				return o1.getIdade().compareTo(o2.getIdade());
			}
		});

		System.out.println(Arrays.toString(array));
		//Neste caso é melhor no caso de se fazer ordenações de ordem diversa
	}

}