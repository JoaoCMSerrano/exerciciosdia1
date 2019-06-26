package pt.com.everis.academia.java.aula3;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private Integer idade;
	public Pessoa(String nome, Integer idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override
	public int compareTo(Pessoa o) {
		return o.getIdade().compareTo(getIdade());
	}
	
	@Override
	public String toString() {
		return "[" + nome + ", " + idade + " anos]";
	}

}
