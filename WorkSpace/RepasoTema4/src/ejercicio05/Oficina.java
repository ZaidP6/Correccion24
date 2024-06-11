package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado[] listaEmpleados;

	@Override
	public String toString() {
		return "Oficina [listaEmpleados=" + Arrays.toString(listaEmpleados) + "]";
	}

	public Empleado[] getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(Empleado[] listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public Oficina(Empleado[] listaEmpleados) {
		super();
		this.listaEmpleados = listaEmpleados;
	}
	
	
	
}
