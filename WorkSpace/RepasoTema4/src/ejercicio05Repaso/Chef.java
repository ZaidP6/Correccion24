package ejercicio05Repaso;

public class Chef extends Trabajador{

	private String especialidad;

	public Chef(String nombre, String nCuenta, double sueldoBase, int anyos, String especialidad) {
		super(nombre, nCuenta, sueldoBase, anyos);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Chef [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularSueldo(double cantidadPorAnyo, int cantPlatos, double precioPlato) {
		return super.calcularSueldo(cantidadPorAnyo, cantPlatos, precioPlato)+ cantPlatos*precioPlato;
	}
	
}
