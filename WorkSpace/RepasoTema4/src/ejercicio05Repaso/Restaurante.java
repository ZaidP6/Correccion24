package ejercicio05Repaso;

public class Restaurante {

	private String nombre;

	public Restaurante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + "]";
	}
	
	
	public double calcularPaga(Trabajador t, double cantidadPorAnyo, int cantPlatos, double precioPlato ) {
		return t.calcularSueldo(cantidadPorAnyo, cantPlatos, precioPlato);
	}
	
	public double calcularGastoNominas(Trabajador [] listaTrabajadores, double cantPorAnyo, double cantPlatos, double precioPlato) {
		
		double total = 0;
		
		for (int i = 0; i < listaTrabajadores.length; i++) {
			
		}
		return total;
	}
}
