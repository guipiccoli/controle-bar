package gerenciadorBar;

public class Socio extends Cliente{

	private int idSocio;
	private int index;
	
	public Socio(String nome, String cpf, int idade, char genero){
		super(nome, cpf, idade, genero);
			idSocio = index;
			index++;
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}

}
