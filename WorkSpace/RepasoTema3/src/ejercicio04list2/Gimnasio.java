package ejercicio04list2;

import java.util.Arrays;

public class Gimnasio {

	private Cliente[] listaClientes;
	private int numClientes;

	public Gimnasio(Cliente[] listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public String toString() {
		return "Gimnasio [listaClientes=" + Arrays.toString(listaClientes) + "]";
	}
	
	public void mostrarLista() {
		for (int i = 0; i < listaClientes.length; i++) {
			System.out.println(listaClientes[i]);
			
		}
	}
	
	public void addClienteToLista(Cliente c) {
		listaClientes[numClientes++] = c;
	}
	
	public Cliente findByDni(String dni) {
		boolean encontrado = false;
		int i= 0;
		while (!encontrado) {
			if(listaClientes[i].getDni().equalsIgnoreCase(dni)) {
				encontrado =true;
			}else
				i++;
		}
		return listaClientes[i];			
	}
	
	public void darDeBaja(String dni) {
		Cliente clienteEncontrado = findByDni(dni);
		if(clienteEncontrado!=null) {
			clienteEncontrado.setActivo(false);
		}
	}
	
	public double calcularMediaIMC() {
		double total =0;
		for (int i = 0; i < listaClientes.length; i++) {
			total +=listaClientes[i].calcularIMC();
		}
		return total/listaClientes.length;
	}
	
}
