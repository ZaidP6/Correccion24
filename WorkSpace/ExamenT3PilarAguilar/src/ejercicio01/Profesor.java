package ejercicio01;

public class Profesor {

	private String nombre;
	private String apellido;
	private int id;
	private double sueldoBase;
	private int horasExtra;
	
	public Profesor(String nombre, String apellido, int id, double sueldoBase, int horasExtra) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.sueldoBase = sueldoBase;
		this.horasExtra = horasExtra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", sueldoBase=" + sueldoBase
				+ ", horasExtra=" + horasExtra + "]";
	}
	
	public double calcularSueldoBruto(double precioHExtra) {
		return sueldoBase + horasExtra*precioHExtra;
	}
	
}
