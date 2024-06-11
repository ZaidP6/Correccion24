package ejercicio05;

public class Gerente extends Empleado{

	private double impuesto;

	public Gerente(int nEmpleado, String nombre, String apellidos, double sueldoBase, double impuesto) {
		super(nEmpleado, nombre, apellidos, sueldoBase);
		this.impuesto = impuesto;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Gerente [impuesto=" + impuesto + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
