package business;

import java.awt.List;
import java.util.ArrayList;

import persistence.Cliente;
import persistence.Socio;

public class Bar {

	private ArrayList<Cliente> listaCliente;

	public Cliente procuraCpf(String cpf) {
		for(int i=0; i<listaCliente.size(); i++){
			if(listaCliente.get(i).getCpf().equals(cpf)){
				return listaCliente.get(i);
			}
		}
		return null;
	}

	public int nroClientes() {
		return listaCliente.size();
	}

	public double[] distriGenero() {
		int homem = 0;
		int mulher = 0;
	
		for(int i=0; i<listaCliente.size(); i++){
			if(listaCliente.get(i).getGenero() == 'M'){
				mulher++;
			}
			else homem++;
		}
		
		double percentH = (homem/listaCliente.size()) * 100.0;
		double percentM = (mulher/listaCliente.size()) * 100.0;
		
		double[] distriGenero = new double[]{percentH, percentM};
		return distriGenero;
	}

	public int[] verificaSocio() {
		int socios = 0;
		int normal = 0;
		for(int i=0; i<listaCliente.size(); i++){
			if(listaCliente.get(i) instanceof Socio ){
				socios++;
			}
			else normal++;
		}
		
		int[] status = new int[]{socios,normal};
		return status;
	}

	public void saida(String cpf) {
		Cliente cli = procuraCpf(cpf);
		listaCliente.remove(cli);
	}

	public void entrada(Cliente cli) {
		listaCliente.add(cli);
	}

	public String encerraDia() {
		return listaCliente.toString();
	}

}
