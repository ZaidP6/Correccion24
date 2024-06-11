package ejercicio05Repaso;

public class Trabajador {

	private String nombre;
	private String nCuenta;
	private double sueldoBase;
	private int anyos;
	public Trabajador(String nombre, String nCuenta, double sueldoBase, int anyos) {
		super();
		this.nombre = nombre;
		this.nCuenta = nCuenta;
		this.sueldoBase = sueldoBase;
		this.anyos = anyos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getnCuenta() {
		return nCuenta;
	}
	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getAnyos() {
		return anyos;
	}
	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", nCuenta=" + nCuenta + ", sueldoBase=" + sueldoBase + ", anyos="
				+ anyos + "]";
	}
	
	public double calcularSueldo(double cantidadPorAnyo, int cantPlatos, double precioPlato) {
		return sueldoBase+cantidadPorAnyo*anyos;
	}
	
	
}
