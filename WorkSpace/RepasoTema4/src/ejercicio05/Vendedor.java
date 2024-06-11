package ejercicio05;

public class Vendedor extends Empleado{

	private int cantVentas;
	private double incentivo;
	
	public Vendedor(int nEmpleado, String nombre, String apellidos, double sueldoBase, int cantVentas,
			double incentivo) {
		super(nEmpleado, nombre, apellidos, sueldoBase);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + ", toString()=" + super.toString()
				+ "]";
	}
	
	public double calcularSaldo(Empleado e, int cantVentas, double incentivo) {
		return e.calcularSueldo() + (cantVentas*100/incentivo);
	}
	
	
}
