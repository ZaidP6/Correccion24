package ejercicio01;

public class AvPasajeros extends Avion{

	private int numPasajeros;

	public AvPasajeros(int id, double longitud, double litrosCombustible, int numPasajeros) {
		super(id, longitud, litrosCombustible);
		this.numPasajeros = numPasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	@Override
	public String toString() {
		return "Avión de pasajeros: "+super.toString()+ " y con "+numPasajeros+ " pasajeros a bordo";	
	}
	
	public double calcularPrecioAterrizaje(double cantPorMetro, double cantPlusLitros, double cantPorPasajero, double cantPorPeligrosidad) {
		
		return super.calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad) 
				+ cantPorPasajero*numPasajeros;
	}
	
	
}
