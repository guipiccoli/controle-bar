package gerenciadorBar;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	private char genero;

	public Cliente(String nome, String cpf, int idade, char genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public char getGenero() {
		return genero;
	}

}
