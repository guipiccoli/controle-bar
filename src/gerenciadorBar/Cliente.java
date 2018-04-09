package gerenciadorBar;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	private char genero;
	private boolean socio;

	public Cliente(String nome, String cpf, int idade, char genero, boolean socio) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.setSocio(socio);
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

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

}
