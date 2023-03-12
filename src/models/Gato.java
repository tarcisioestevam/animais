package models;

public class Gato {
	
	private String nome;
	private String cor;
	private Integer idade;
	
	public Gato() {}
	
	public Gato(String nome, String cor, Integer idade) {
		this.setNome(nome);
		this.setCor(cor);
		this.setIdade(idade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
}
