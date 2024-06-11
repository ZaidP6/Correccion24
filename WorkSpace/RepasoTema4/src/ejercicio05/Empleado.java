package ejercicio05;

public class Empleado {
	
	private int nEmpleado;
	private String nombre,apellidos;
	private double sueldoBase;
	
	public Empleado(int nEmpleado, String nombre, String apellidos, double sueldoBase) {
		super();
		this.nEmpleado = nEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
	}

	public int getnEmpleado() {
		return nEmpleado;
	}

	public void setnEmpleado(int nEmpleado) {
		this.nEmpleado = nEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado [nEmpleado=" + nEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase="
				+ sueldoBase + "]";
	}
	
	public double calcularSueldo() {
		return sueldoBase;
	}
	
}
