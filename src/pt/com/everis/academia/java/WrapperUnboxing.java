package pt.com.everis.academia.java;

public class WrapperUnboxing {

	public static void main(String[] args) {
		Integer i = new Integer(125);
		Integer j = i;
		System.out.println(i==j); // (true) referem-se a um mesmo objecto
		i++;
		//i--; //embora tenham valores iguais quando decrementamos o valor de i, ele iria retornar falso porque ficaria com apontadores diferentes (??)
		//j++; //embora tenham valores iguais, o que faz retornar true é o facto de estarem a apontar para o mesmo endereço (??)
		System.out.println("i = " + i);
		System.out.println(i == j); // (false) referem-se a objectos diferentes

	}

}
