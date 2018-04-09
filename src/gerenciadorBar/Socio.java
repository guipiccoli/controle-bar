package gerenciadorBar;

public class Socio {

	private int idSocio;
	private int index;

	private Cliente cliente;
	
	public Socio(Cliente cli){
		if(cli.isSocio());
			idSocio = index;
			index++;
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
