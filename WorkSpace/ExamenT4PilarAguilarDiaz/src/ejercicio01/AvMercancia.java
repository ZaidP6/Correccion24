package ejercicio01;

public class AvMercancia extends Avion {

	private boolean mPeligrosa;

	public AvMercancia(int id, double longitud, double litrosCombustible, boolean mPeligrosa) {
		super(id, longitud, litrosCombustible);
		this.mPeligrosa = mPeligrosa;
	}

	public boolean ismPeligrosa() {
		return mPeligrosa;
	}

	public void setmPeligrosa(boolean mPeligrosa) {
		this.mPeligrosa = mPeligrosa;
	}

	@Override
	public String toString() {
		return "Avión de mercancía: "+super.toString()+ " y mercantia peligrosa = "+mPeligrosa;		
	}

	public double calcularPrecioAterrizaje(double cantPorMetro, double cantPlusLitros, double cantPorPasajero,
			double cantPorPeligrosidad) {
		if (mPeligrosa) {
			return super.calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad)
					+ cantPorPeligrosidad;
		} else
			return super.calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad);
	}
	
	public void avisarBomberos() {
		if (mPeligrosa) {
			System.out.println("¡Cuidado, la mercancía es peligrosa!");
		}
	}

}
