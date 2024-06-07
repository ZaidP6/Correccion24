package ejercicio01;

public class Gestoria {

	Profesor prof;

	public Gestoria(Profesor prof) {
		super();
		this.prof = prof;
	}

	public Profesor getProf() {
		return prof;
	}

	public void setProf(Profesor prof) {
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "Gestoria [prof=" + prof + "]";
	}
	
	public double calcularSueldoNeto( double porcentajeImpuesto, double precioHExtra) {
		
		return prof.calcularSueldoBruto(precioHExtra) - prof.calcularSueldoBruto(precioHExtra)*porcentajeImpuesto/100;
	}
	
	public boolean comprobarTopeHoras(Profesor p, int tope) {
		
		if(p.getHorasExtra()>tope) {
			return true;
		}else
			return false;
	}
	
	public void mostrarAvisoHExtras(Profesor p, int tope) {
		if(this.comprobarTopeHoras(p, tope)==true) {
			System.out.println("Se ha pasado de horas extra este mes.");
		}else
			System.out.println("Este mes no se ha pasado de horas extra");
	}
	
	public double calcularAhorro(double gastosMes, double porcentajeImpuesto, double precioHExtra) {
		double totalAhorro = this.calcularSueldoNeto(porcentajeImpuesto, precioHExtra) - gastosMes;
		return totalAhorro;
	}
	
	public double modificarSueldoBase(double nuevoSueldo) {
		if(nuevoSueldo>0) {
			prof.setSueldoBase(nuevoSueldo);
			return prof.getSueldoBase();
		}
		return 0.0;
		
	}
	
}
